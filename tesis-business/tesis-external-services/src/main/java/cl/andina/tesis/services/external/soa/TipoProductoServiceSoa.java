package cl.andina.tesis.services.external.soa;

import cl.andina.tesis.services.TipoProductoService;
import cl.andina.tesis.services.external.request.GeneralRequest;
import cl.andina.tesis.services.external.response.ClienteResponse;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService(
        targetNamespace = "http://cl.andina/TipoProductoService",
        name = "TipoProductoWebService",
        serviceName = "TipoProductoService"
)
public class TipoProductoServiceSoa
{
    @Resource
    private TipoProductoService tipoProductoService;

    @WebMethod
    @WebResult(name = "consultaPorIdResponse")
    public ClienteResponse buscarPorId(@WebParam(name = "buscarPorId")
                                       @XmlElement(required = true) GeneralRequest request)
    {
        ClienteResponse response = new ClienteResponse();

        response.setClientes(tipoProductoService.buscarPorId(request));

        return response;
    }

    @WebMethod
    @WebResult(name = "consultaActivosResponse")
    public ClienteResponse buscarActivos()
    {
        ClienteResponse response = new ClienteResponse();

        response.setClientes(tipoProductoService.traerActivos());

        return response;
    }

    @WebMethod
    @WebResult(name = "desactivarResponse")
    public void desactivar(@WebParam(name = "desactivar")
                           @XmlElement(required = true) GeneralRequest request)
    {
        tipoProductoService.desactivar(request);

    }

    @WebMethod
    @WebResult(name = "activarResponse")
    public void activar(@WebParam(name = "activar")
                        @XmlElement(required = true) GeneralRequest request)
    {
        tipoProductoService.activar(request);

    }
}
