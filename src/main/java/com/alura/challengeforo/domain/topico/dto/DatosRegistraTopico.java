package com.alura.challengeforo.domain.topico.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record DatosRegistraTopico(
        @NotNull
        Long usuarioId,
        @NotNull
        Long cursoId,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje
        ) {
}