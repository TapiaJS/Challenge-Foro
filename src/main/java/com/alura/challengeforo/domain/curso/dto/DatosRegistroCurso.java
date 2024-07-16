package com.alura.challengeforo.domain.curso.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroCurso(
        @NotNull
        Long id,
        @NotBlank
        String nombre,
        @NotBlank
        String categoria
) {
}
