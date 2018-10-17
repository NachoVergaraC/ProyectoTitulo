package cl.andina.tesis.dao.impl;

import cl.andina.tesis.dao.ClienteDao;
import cl.andina.tesis.mappers.ClienteMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository(value = "clienteDao")
public class ClienteJpaDao
        implements ClienteDao
{
    @Resource
    private ClienteMapper clienteMapper;

    @Override
    public int buscarCliente(long id)
    {
        return clienteMapper.buscarCliente(id);
    }
}
