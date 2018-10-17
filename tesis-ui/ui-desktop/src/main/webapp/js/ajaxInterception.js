// Librería que permite identificar una sesión caduca, en una llamada AJAX de PrimeFaces.

var OnCompleteWrapper = function (original) {
    this.originalClosure = original;
};

OnCompleteWrapper.prototype.broker = function (xhr, status, args) {

    if (xhr.responseText) {
        var xmlDoc = $.parseXML(xhr.responseText);

        if ($(xmlDoc).find('partial-response').is(':empty')) {
            alert("La sesi\u00f3n parece haber expirado. Debe reconectarse");
            location.href = "/depoline/app/login";
        }
    }

    if (this.originalClosure) {
        this.originalClosure(xhr, status, args);
    }
};

var originalPrimeFacesAjaxUtilsSend = PrimeFaces.ajax.Request.send;
PrimeFaces.ajax.Request.send = function (cfg) {

    if (cfg.oncomplete) {
        var obj = new OnCompleteWrapper(cfg.oncomplete);

        cfg.oncomplete = function (xhr, status, args) {
            obj.broker(xhr, status, args);
        };
    }
    else if (cfg.onsuccess) {
        var obj = new OnCompleteWrapper(cfg.onsuccess);

        cfg.oncomplete = function (xhr, status, args) {
            obj.broker(xhr, status, args);
        };
    }

    originalPrimeFacesAjaxUtilsSend.apply(this, arguments);
};
