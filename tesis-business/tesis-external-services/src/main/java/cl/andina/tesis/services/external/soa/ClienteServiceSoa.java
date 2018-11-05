package cl.andina.tesis.services.external.soa;

import cl.andina.tesis.services.ClienteService;
import cl.andina.tesis.services.external.request.ClienteRequest;
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
                                         @XmlElement(required = true) ClienteRequest request)
    {
        ClienteResponse response = new ClienteResponse();

            response.setClientes(clienteService.buscarCliente(request));

        return response;
    }
}
