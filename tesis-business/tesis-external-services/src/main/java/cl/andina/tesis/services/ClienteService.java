package cl.andina.tesis.services;

import cl.andina.tesis.dto.ClienteDTO;
import cl.andina.tesis.services.external.request.ClienteRequest;

import java.util.List;

public interface ClienteService
{

    List<ClienteDTO> buscarCliente(ClienteRequest request);
}
