package cl.andina.tesis.services;

import cl.andina.tesis.dto.ClienteDTO;
import cl.andina.tesis.services.external.request.GeneralRequest;
import cl.andina.tesis.services.external.request.TipoRequest;

import java.util.List;

public interface FormatoProductoService
{
    List<ClienteDTO> buscarPorId(GeneralRequest request);

    List<ClienteDTO> traerActivos();

    int desactivar(GeneralRequest request);

    int activar(GeneralRequest request);

    int agregar(TipoRequest request);
}
