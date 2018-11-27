package cl.andina.tesis.services.external.soa;

import cl.andina.tesis.services.MarcaService;
import cl.andina.tesis.services.external.request.GeneralRequest;
import cl.andina.tesis.services.external.request.TipoRequest;
import cl.andina.tesis.services.external.response.ClienteResponse;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService(
        targetNamespace = "http://cl.andina/MarcaService",
        name = "MarcaWebService",
        serviceName = "MarcaService"
)
public class MarcaServiceSoa
{
    @Resource
    private MarcaService marcaService;

    @WebMethod
    @WebResult(name = "consultaPorIdResponse")
    public ClienteResponse buscarPorId(@WebParam(name = "buscarPorId")
                                       @XmlElement(required = true) GeneralRequest request)
    {
        ClienteResponse response = new ClienteResponse();

        response.setClientes(marcaService.buscarPorId(request));

        return response;
    }

    @WebMethod
    @WebResult(name = "consultaActivosResponse")
    public ClienteResponse buscarActivos()
    {
        ClienteResponse response = new ClienteResponse();

        response.setClientes(marcaService.traerActivos());

        return response;
    }

    @WebMethod
    @WebResult(name = "desactivarResponse")
    public void desactivar(@WebParam(name = "desactivar")
                           @XmlElement(required = true) GeneralRequest request)
    {
        marcaService.desactivar(request);

    }

    @WebMethod
    @WebResult(name = "activarResponse")
    public void activar(@WebParam(name = "activar")
                        @XmlElement(required = true) GeneralRequest request)
    {
        marcaService.activar(request);

    }

    @WebMethod
    @WebResult(name = "agregarResponse")
    public void agregar(@WebParam(name = "agregar")
                        @XmlElement(required = true) TipoRequest request)
    {
        marcaService.agregar(request);

    }
}
