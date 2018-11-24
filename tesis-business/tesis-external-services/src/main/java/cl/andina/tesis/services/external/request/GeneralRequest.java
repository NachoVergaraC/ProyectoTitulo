package cl.andina.tesis.services.external.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(propOrder = {"id"})

@XStreamAlias(value = "consultaGeneralRequest")
public class GeneralRequest
{
    @XmlElement(required = true)
    @NotNull
    @NotEmpty
    long id;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }
}
