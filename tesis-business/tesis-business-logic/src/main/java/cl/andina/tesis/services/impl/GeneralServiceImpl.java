package cl.andina.tesis.services.impl;

import cl.andina.tesis.dao.ClienteDao;

import javax.annotation.Resource;
import javax.inject.Named;

@Named(value = "generalService")
public class GeneralServiceImpl
{
    @Resource
    private ClienteDao clienteDao;

    int buscarCliente(long id)
    {
        return clienteDao.buscarCliente(id);
    }
}
