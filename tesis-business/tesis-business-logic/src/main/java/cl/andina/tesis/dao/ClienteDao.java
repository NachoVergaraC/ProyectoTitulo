package cl.andina.tesis.dao;

import cl.andina.tesis.dto.ClienteDTO;

import java.util.List;

public interface ClienteDao
{
    List<ClienteDTO> buscarCliente(long id);

    List<ClienteDTO> buscarClientesActivos();

    int desactivarCliente(long id);

    int activarCliente(long id);

    int eliminarCliente(long id);
}
