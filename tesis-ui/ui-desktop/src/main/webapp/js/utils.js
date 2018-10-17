function postLlamada(args, dialogos) {
    if (args == null) {
        return;
    }

    if (dialogos === undefined) {
        dialogos = {};
    }

    if (args.validationFailed) {

        switch (args.validationFailureLevel) {
            case "FATAL":
                if (dialogos.fatalLevel !== undefined) {
                    PF(dialogos.fatalLevel).show();
                    return;
                }
                break;
            case "ERROR":
                if (dialogos.errorLevel !== undefined) {
                    PF(dialogos.errorLevel).show();
                    return;
                }
                break;
            case "WARN":
                if (dialogos.warnLevel !== undefined) {
                    PF(dialogos.warnLevel).show();
                    return;
                }
                break;
            case "INFO":
                if (dialogos.infoLevel !== undefined) {
                    PF(dialogos.infoLevel).show();
                    return;
                }
                break;
            default:
                PF('dlgMessages').show();
                return;
        }
    }

    if (args.showMessages) {
        PF('dlgMessages').show();
    }
}

function forceSelect(elem) {
    setTimeout(function () {
        if (elem.value.trim() != '')
            elem.select();
    }, 100);
}

function validateRealNumberInput(event, numberDecimals, acceptNegative) {
    var code = event.keyCode;

    if (event.ctrlKey) {
        return true;
    }

    if ((code >= 8 && code <= 9)
        || (code >= 48 && code <= 57) // numeros
        || (code >= 96 && code <= 105) // numpad
        || (code == 110 || code == 190 ) // punto
        || (code == 188) // coma
        || (code >= 35 && code <= 46) // home, end, arrows, insert, delete
        || (code >= 16 && code <= 18) // ctrl o alt o shift
        ) {

        var posicionDecimal = event.target.value.indexOf(",");
        if (code == 110 || code == 190) {
            event.preventDefault();

            if (posicionDecimal > -1)
                return false;

            var positionCursor = $("input[id$='" + event.target.id + "']").getCursorPosition();
            event.target.value = event.target.value.substring(0, positionCursor) + ","
                + event.target.value.substring(positionCursor);
        }
        else if (code == 188 && posicionDecimal > -1) {
            return false;
        }

        if (posicionDecimal > -1 && (event.target.value.length - posicionDecimal) > numberDecimals) {
            if ($("input[id$='" + event.target.id + "']").getCursorPosition() > posicionDecimal
                && ((code >= 48 && code <= 57) || (code >= 96 && code <= 105))) {
                return false;
            }
        }

        return true;
    }
    else if (acceptNegative && (code == 109 || code == 173 || code == 189)) {
        if (event.target.value.indexOf('-') > -1
            || $("input[id$='" + event.target.id + "']").getCursorPosition() > 0) {
            return false;
        }
        return true;
    }
    else {
        return false;
    }
};

function validateNaturalNumberInput(event, acceptNegative) {
    var code = event.keyCode;

    if (event.ctrlKey)
    {
        return true;
    }

    if ((code >= 8 && code <= 9)
        || (code >= 48 && code <= 57) // numeros
        || (code >= 96 && code <= 105) // numpad
        || (code >= 35 && code <= 46) // home, end, arrows, insert, delete
        || (code >= 16 && code <= 18) // ctrl o alt o shift
        ) {
        return true;
    }
    else if (acceptNegative && (code == 109 || code == 173 || code == 189))
    {
        if (event.target.value.indexOf('-') > -1
            || $("input[id$='" + event.target.id + "']").getCursorPosition() > 0)
        {
            return false;
        }
        return true;
    }
    else
    {
        return false;
    }
};

function validateDenominador(event) {
    var code = event.keyCode;

    if (event.ctrlKey)
    {
        return true;
    }

    if ((code >= 8 && code <= 9)
        || (code >= 48 && code <= 57) // numeros
        || (code >= 65 && code <= 90) // A-Z
        || (code >= 96 && code <= 105) // numpad
        || (code >= 35 && code <= 46) // home, end, arrows, insert, delete
        || (code >= 16 && code <= 18) // ctrl o alt o shift
        ) {
        return true;
    }
    else
    {
        return false;
    }
};

function validateRutInput(event)
{
    var code = event.keyCode;

    if ((code >= 8 && code <= 9)
        || (code >= 48 && code <= 57) // numeros
        || (code >= 96 && code <= 105) // numpad
        || (code == 109 || code == 173 ) // guion
        || (code >= 35 && code <= 46) // home, end, arrows, insert, delete
        || (code >= 16 && code <= 18) // ctrl o alt o shift)
        )
    {
        var posicionGuion = event.target.value.indexOf("-");
        if (code == 109 || code == 173)
        {
            if (posicionGuion > -1)
                return false;
        }

        if (posicionGuion > -1 && (event.target.value.length - posicionGuion) > 1)
        {
            if ($("input[id$='" + event.target.id + "']").getCursorPosition() > posicionGuion
                && ((code >= 48 && code <= 57) || (code >= 96 && code <= 105)))
            {
                return false;
            }
        }

        return true;
    }
    else if (code == 75 || code == 107 ) // k o K
    {
        event.preventDefault();

        var posicionK = event.target.value.indexOf("K");

        if (posicionK > -1)
            return false;

        var positionCursor = $("input[id$='" + event.target.id + "']").getCursorPosition();

        if (positionCursor != event.target.value.length)
            return false;

        event.target.value += "K";
        return true;
    }
    else {
        return false;
    }
};

function aceptaNavegacion(event) {
    var code = event.keyCode;

    if (event.ctrlKey) {
        return true;
    }

    if ((code >= 8 && code <= 9) // backspace y tab
        || (code >= 35 && code <= 46) // home, end, arrows, insert, delete
        || (code >= 16 && code <= 18) // ctrl o alt o shift
        ) {
        return true;
    }

    return false;
};

function initInputRestrictions()
{
    $("input.asPositiveLong").keydown(function(event) { return validateNaturalNumberInput(event, false); });
    $("input.asLong").keydown(function(event) { return validateNaturalNumberInput(event, true); });
    $("input.asRut").keydown(function(event) {return validateRutInput(event); });
    $("input.asPositiveDouble2").keydown(function(event) {return validateRealNumberInput(event, 2, false); });
    $("input.asPositiveDouble3").keydown(function(event) {return validateRealNumberInput(event, 3, false); });
    $("input.asDouble2").keydown(function(event) {return validateRealNumberInput(event, 2, true); });
    $("input.asDouble3").keydown(function(event) {return validateRealNumberInput(event, 3, true); });
    $("input.denominador").keydown(function(event) {return validateDenominador(event); });
}

$(document).ready(initInputRestrictions);

function getWidgetVarById(id) {
    for (var propertyName in PrimeFaces.widgets) {
        if (PrimeFaces.widgets[propertyName].id == id) {
            return PrimeFaces.widgets[propertyName];
        }
    }
};

function getWidgetVarByMatch(cssExpression) {
    var id;
    if ($(cssExpression) != null)
     return getWidgetVarById($(cssExpression).attr('id'));
};

function disableByCssMatch(cssExpression) {
    var elem = getWidgetVarByMatch(cssExpression);
    if (elem != undefined)
        elem.disable();
}

function convertirEnReadonly(form) {
    $(form).find("input, textarea, div[class*='ui-chkbox-box'], div[class*='ui-selectonemenu'], div[class*='ui-selectonemenu-label']").each(function () {
        $(this).prop('readonly', 'true');
        $(this).removeClass('ui-state-active');
        $(this).addClass('ui-state-disabled');
        $(this).unbind('click');

        var componente = getWidgetVarById($(this).attr('id'));
        if (componente != undefined)
        {
            componente.disable();
        }

        /*if(($(this).parent().prop('nodeName')) == 'SPAN')
        {
            componente = getWidgetVarById($(this).parent().attr('id'));
            //componente = getWidgetVarById('forms:fechaEstimada');

            if (componente != undefined)
            {
                componente.disable();
            }
        }*/
    });

    $(form).find("span[class*='ui-icon-search'], span[class*='ui-icon-trash'], span[class*='ui-icon-circle-check']").each(function () {
        $(this).parent().remove();
    });

};
