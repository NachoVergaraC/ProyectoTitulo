package cl.andina.tesis.services.impl;

import cl.andina.tesis.dao.ClienteDao;
import cl.andina.tesis.dto.ClienteDTO;
import cl.andina.tesis.mappers.ClienteServiceMapper;
import cl.andina.tesis.services.ClienteService;
import cl.andina.tesis.services.external.request.GeneralRequest;

import javax.annotation.Resource;
import javax.inject.Named;
import java.util.List;

@Named(value = "clienteService")
public class ClienteServiceImpl
        implements ClienteService
{
    @Resource
    private ClienteServiceMapper clienteServiceMapper;

    @Override
    public List<ClienteDTO> buscarPorId(GeneralRequest request)
    {
        return clienteServiceMapper.buscarPorId(request.getId());
    }

    @Override
    public List<ClienteDTO> traerActivos()
    {
        return clienteServiceMapper.buscarActivos();
    }

    @Override
    public int desactivar(GeneralRequest request)
    {
        return clienteServiceMapper.desactivar(request.getId());
    }

    @Override
    public int activar(GeneralRequest request)
    {
        return clienteServiceMapper.activar(request.getId());
    }
}
