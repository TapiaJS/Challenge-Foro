package com.alura.challengeforo.domain.topico.dto;

import com.alura.challengeforo.domain.topico.Estado;
import com.alura.challengeforo.domain.topico.Topico;

import java.time.LocalDateTime;
import java.util.List;

public record DatosResponseTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        LocalDateTime fechaClose,
        Estado status,
        int totalRespuestas,
        List<Long> respuestasIds,
        Long usuarioId,
        Long cursoId
) {

    public DatosResponseTopico(Topico topico) {

        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getFechaClose(),
                topico.getStatus(),
                topico.getTotalRespuestas(),
                topico.respuestasIds(),
                topico.getUsuario().getId(),
                topico.getCurso().getId()
        );
    }
}
