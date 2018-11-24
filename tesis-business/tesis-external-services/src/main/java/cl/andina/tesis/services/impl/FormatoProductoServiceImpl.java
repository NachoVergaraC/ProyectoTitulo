package cl.andina.tesis.services.impl;

import cl.andina.tesis.dto.ClienteDTO;
import cl.andina.tesis.mappers.FormatoProductoServiceMapper;
import cl.andina.tesis.services.FormatoProductoService;
import cl.andina.tesis.services.external.request.GeneralRequest;

import javax.annotation.Resource;
import javax.inject.Named;
import java.util.List;

@Named(value = "formatoService")
public class FormatoProductoServiceImpl
        implements FormatoProductoService
{
    @Resource
    private FormatoProductoServiceMapper formatoProductoServiceMapper;

    @Override
    public List<ClienteDTO> buscarPorId(GeneralRequest request)
    {
        return formatoProductoServiceMapper.buscarPorId(request.getId());
    }

    @Override
    public List<ClienteDTO> traerActivos()
    {
        return formatoProductoServiceMapper.buscarActivos();
    }

    @Override
    public int desactivar(GeneralRequest request)
    {
        return formatoProductoServiceMapper.desactivar(request.getId());
    }

    @Override
    public int activar(GeneralRequest request)
    {
        return formatoProductoServiceMapper.activar(request.getId());
    }
}
