package cl.andina.tesis.services.impl;

import cl.andina.tesis.dao.ClienteDao;
import cl.andina.tesis.dto.ClienteDTO;
import cl.andina.tesis.mappers.MarcaServiceMapper;
import cl.andina.tesis.services.ClienteService;
import cl.andina.tesis.services.MarcaService;
import cl.andina.tesis.services.external.request.GeneralRequest;

import javax.annotation.Resource;
import javax.inject.Named;
import java.util.List;

@Named(value = "marcaService")
public class MarcaServiceImpl
        implements MarcaService
{
    @Resource
    private MarcaServiceMapper marcaServiceMapper;

    @Override
    public List<ClienteDTO> buscarPorId(GeneralRequest request)
    {
        return marcaServiceMapper.buscarPorId(request.getId());
    }

    @Override
    public List<ClienteDTO> traerActivos()
    {
        return marcaServiceMapper.buscarActivas();
    }

    @Override
    public int desactivar(GeneralRequest request)
    {
        return marcaServiceMapper.desactivar(request.getId());
    }

    @Override
    public int activar(GeneralRequest request)
    {
        return marcaServiceMapper.activar(request.getId());
    }
}
