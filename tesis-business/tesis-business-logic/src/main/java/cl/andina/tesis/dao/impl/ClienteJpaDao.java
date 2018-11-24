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
    public List<ClienteDTO> buscarCliente(long id)
    {
        return clienteMapper.buscarCliente(id);
    }

    @Override
    public List<ClienteDTO> buscarClientesActivos()
    {
        return clienteMapper.buscarClientesActivos();
    }

    @Override
    public int desactivarCliente(long idCliente)
    {
        return clienteMapper.desactivarCliente(idCliente);
    }

    @Override
    public int activarCliente(long idCliente)
    {
        return clienteMapper.activarCliente(idCliente);
    }

    @Override
    public int eliminarCliente(long idCliente)
    {
        return clienteMapper.eliminarCliente(idCliente);
    }
}
