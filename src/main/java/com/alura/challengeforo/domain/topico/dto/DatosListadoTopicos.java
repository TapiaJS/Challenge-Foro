package com.alura.challengeforo.domain.topico.dto;

import com.alura.challengeforo.domain.topico.Estado;
import com.alura.challengeforo.domain.topico.Topico;

import java.time.LocalDateTime;
import java.util.List;

public record DatosListadoTopicos(Long id,
                                  String titulo,
                                  String mensaje,
                                  LocalDateTime fechaCreacion,
                                  Estado status,
                                  int respuestas,
                                  List<Long> respuestasIds,
                                  Long usuarioId,
                                  Long cursoId
) {

    public DatosListadoTopicos(Topico topico) {

        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getStatus(),
                topico.getTotalRespuestas(),
                topico.respuestasIds(),
                topico.getUsuario().getId(),
                topico.getCurso().getId()
        );
    }
}
