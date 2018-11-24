package cl.andina.tesis.dao.impl;

import cl.andina.tesis.dao.ClienteDao;
import cl.andina.tesis.dto.ClienteDTO;
import cl.andina.tesis.mappers.ClienteMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository(value = "clienteDao")
public class ClienteJpaDao
        implements ClienteDao
{
    @Resource
    private ClienteMapper clienteMapper;

    @Override
    public List<ClienteDTO> buscarPorId(long id)
    {
        return clienteMapper.buscarCliente(id);
    }

    @Override
    public List<ClienteDTO> buscarActivos()
    {
        return clienteMapper.buscarClientesActivos();
    }

    @Override
    public int desactivar(long idCliente)
    {
        return clienteMapper.desactivarCliente(idCliente);
    }

    @Override
    public int activar(long idCliente)
    {
        return clienteMapper.activarCliente(idCliente);
    }

    @Override
    public int eliminar(long idCliente)
    {
        return clienteMapper.eliminarCliente(idCliente);
    }
}
