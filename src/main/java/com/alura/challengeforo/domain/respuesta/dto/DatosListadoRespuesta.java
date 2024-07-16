package com.alura.challengeforo.domain.respuesta.dto;

import com.alura.challengeforo.domain.respuesta.Respuesta;

import java.time.LocalDateTime;

public record DatosListadoRespuesta(
        Long id,
        String mensaje,
        Long topicoId,
        LocalDateTime fechaCreacion,
        Long usuarioId,
        String solucion
) {

    public DatosListadoRespuesta(Respuesta respuesta) {

        this(
                respuesta.getId(),
                respuesta.getMensaje(),
                respuesta.getTopico().getId(),
                respuesta.getFechaCreacion(),
                respuesta.getAutorRespuesta().getId(),
                respuesta.getSolucion()
        );
    }
}

