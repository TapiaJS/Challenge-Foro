package com.alura.challengeforo.domain.usuario.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DatosAutenticacionUsuario(

        @Email
        @NotBlank
        String correoElectronico,
        @NotBlank
        String contraseña
) {
}
