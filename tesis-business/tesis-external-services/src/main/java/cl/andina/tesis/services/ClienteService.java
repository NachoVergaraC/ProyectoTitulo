package cl.andina.tesis.services;

import cl.andina.tesis.dto.ClienteDTO;
import cl.andina.tesis.services.external.request.GeneralRequest;

import java.util.List;

public interface ClienteService
{
    List<ClienteDTO> buscarPorId(GeneralRequest request);

    List<ClienteDTO> traerActivos();

    int desactivar(GeneralRequest request);

    int activar(GeneralRequest request);
}
