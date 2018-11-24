package cl.andina.tesis.mappers;

import cl.andina.tesis.dto.ClienteDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClienteServiceMapper
{
    List<ClienteDTO> buscarPorId(@Param("id") long id);

    List<ClienteDTO> buscarActivos();

    int desactivar(@Param("id") long id);

    int activar(@Param("id") long id);

    int eliminar(@Param("id") long id);
}