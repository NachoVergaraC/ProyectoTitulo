package cl.andina.tesis.services.impl;

import cl.andina.tesis.dto.ClienteDTO;
import cl.andina.tesis.mappers.ClienteServiceMapper;
import cl.andina.tesis.services.ClienteService;
import cl.andina.tesis.services.external.request.ClienteRequest;

import javax.annotation.Resource;
import javax.inject.Named;
import java.util.List;

import static java.util.Arrays.*;

@Named(value = "clienteService")
public class ClienteServiceImpl
        implements ClienteService
{
    @Resource
    private ClienteServiceMapper clienteServiceMapper;

    @Override
    public List<ClienteDTO> buscarCliente(ClienteRequest request)
    {

        ClienteDTO bleh = new ClienteDTO();

        bleh.setRut("17852753-3");
        bleh.setNombre("Ignacio Vergara");
        bleh.setGiro("Caca");

        return asList(bleh);
    }
}
