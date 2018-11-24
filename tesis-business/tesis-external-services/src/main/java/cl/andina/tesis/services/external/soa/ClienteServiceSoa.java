package cl.andina.tesis.services.external.soa;

import cl.andina.tesis.services.ClienteService;
import cl.andina.tesis.services.external.request.GeneralRequest;
import cl.andina.tesis.services.external.response.ClienteResponse;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService(
        targetNamespace = "http://cl.andina/ClienteServices",
        name = "ClienteWebService",
        serviceName = "ClienteService"
)
public class ClienteServiceSoa
{
    @Resource
    private ClienteService clienteService;

    @WebMethod
    @WebResult(name = "ConsultaDocumentoAduanaResponse")
    public ClienteResponse buscarCliente(@WebParam(name = "buscarCliente")
                                         @XmlElement(required = true) GeneralRequest request)
    {
        ClienteResponse response = new ClienteResponse();

            response.setClientes(clienteService.buscarPorId(request));

        return response;
    }

    @WebMethod
    @WebResult(name = "clientesActivosResponse")
    public ClienteResponse buscarClientesActivos()
    {
        ClienteResponse response = new ClienteResponse();

        response.setClientes(clienteService.traerActivos());

        return response;
    }

    @WebMethod
    @WebResult(name = "desactivarClienteResponse")
    public void desactivarCliente(@WebParam(name = "desactivarCliente")
                                         @XmlElement(required = true) GeneralRequest request)
    {
        clienteService.desactivar(request);

    }

    @WebMethod
    @WebResult(name = "activarClienteResponse")
    public void activarCliente(@WebParam(name = "activarCliente")
                                  @XmlElement(required = true) GeneralRequest request)
    {
        clienteService.activar(request);

    }
}
