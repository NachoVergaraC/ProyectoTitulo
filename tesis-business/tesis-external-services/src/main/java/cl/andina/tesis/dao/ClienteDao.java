package cl.andina.tesis.dao;

import cl.andina.tesis.dto.ClienteDTO;

import java.util.List;

public interface ClienteDao
{
    List<ClienteDTO> buscarPorId(long id);

    List<ClienteDTO> buscarActivos();

    int desactivar(long id);

    int activar(long id);

    int eliminar(long id);
}
