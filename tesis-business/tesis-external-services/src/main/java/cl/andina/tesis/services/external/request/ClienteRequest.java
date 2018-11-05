package cl.andina.tesis.services.external.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(propOrder = {"idCliente"})

@XStreamAlias(value = "consultaClienteRequest")
public class ClienteRequest
{
    @XmlElement(required = true)
    @NotNull
    @NotEmpty
    long idCliente;

    public long getIdCliente()
    {
        return idCliente;
    }

    public void setIdCliente(long idCliente)
    {
        this.idCliente = idCliente;
    }
}
