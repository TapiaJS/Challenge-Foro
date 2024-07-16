package com.alura.challengeforo.domain.usuario.dto;

import com.alura.challengeforo.domain.usuario.Usuario;

public record DatosResponseUsuario(
        Long id,
        String nombre,
        Long perfil
) {

    public DatosResponseUsuario(Usuario usuario) {

        this(
                usuario.getId(),
                usuario.getNombre(),
                usuario.getPerfil().getId()
        );
    }
}
