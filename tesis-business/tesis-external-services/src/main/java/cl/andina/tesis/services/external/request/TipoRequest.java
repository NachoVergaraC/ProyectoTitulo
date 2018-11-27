package cl.andina.tesis.services.external.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(propOrder = {"codigo", "nombre"})

@XStreamAlias(value = "tipoRequest")
public class TipoRequest
{
    @XmlElement(required = true)
    @NotNull
    @NotEmpty
    String codigo;

    @XmlElement(required = true)
    @NotNull
    @NotEmpty
    String nombre;

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}
