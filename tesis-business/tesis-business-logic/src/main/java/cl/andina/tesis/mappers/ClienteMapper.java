package cl.andina.tesis.mappers;

import org.apache.ibatis.annotations.Param;

public interface ClienteMapper
{
    int buscarCliente(@Param("id") long id);
}
