package cl.andina.tesis.services.impl;

import cl.andina.tesis.dao.ClienteDao;
import cl.andina.tesis.dto.ClienteDTO;
import cl.andina.tesis.mappers.TipoProductoServiceMapper;
import cl.andina.tesis.services.ClienteService;
import cl.andina.tesis.services.TipoProductoService;
import cl.andina.tesis.services.external.request.GeneralRequest;

import javax.annotation.Resource;
import javax.inject.Named;
import java.util.List;

@Named(value = "clienteService")
public class TipoProductoServiceImpl
        implements TipoProductoService
{
    @Resource
    private TipoProductoServiceMapper tipoProductoServiceMapper;

    @Override
    public List<ClienteDTO> buscarPorId(GeneralRequest request)
    {
        return tipoProductoServiceMapper.buscarPorId(request.getId());
    }

    @Override
    public List<ClienteDTO> traerActivos()
    {
        return tipoProductoServiceMapper.buscarActivos();
    }

    @Override
    public int desactivar(GeneralRequest request)
    {
        return tipoProductoServiceMapper.desactivar(request.getId());
    }

    @Override
    public int activar(GeneralRequest request)
    {
        return tipoProductoServiceMapper.activar(request.getId());
    }
}
