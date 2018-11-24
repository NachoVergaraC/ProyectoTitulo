package cl.andina.tesis.mappers;

import cl.andina.tesis.dto.ClienteDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClienteMapper
{
    List<ClienteDTO> buscarCliente(@Param("id") long id);

    List<ClienteDTO> buscarClientesActivos();

    int desactivarCliente(@Param("id") long id);

    int activarCliente(@Param("id") long id);

    int eliminarCliente(@Param("id") long id);
}
