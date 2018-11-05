package cl.andina.tesis.services.external.response;

import cl.andina.tesis.dto.ClienteDTO;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "ClienteResponse", propOrder = {"clientes"})
public class ClienteResponse
{
    @XmlElementWrapper(name = "clientes")
    @XmlElement(name = "cliente", nillable = true)
    private List<ClienteDTO> clientes;

    public List<ClienteDTO> getClientes()
    {
        return clientes;
    }

    public void setClientes(List<ClienteDTO> clientes)
    {
        this.clientes = clientes;
    }
}
