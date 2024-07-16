package com.alura.challengeforo.domain.usuario.dto;

import jakarta.validation.constraints.NotNull;

public record DatosActualizaPerfilUsuario(

        @NotNull(message = "El id es obligatorio")
        Long id,
        Long perfilId) {
}
