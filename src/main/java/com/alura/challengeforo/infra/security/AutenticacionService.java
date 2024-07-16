package com.alura.challengeforo.infra.security;

import com.alura.challengeforo.domain.usuario.UsuarioRepository;
import com.alura.challengeforo.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AutenticacionService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String correoElectronico) throws UsernameNotFoundException {
                if(usuarioRepository.existsByCorreoElectronicoAndActivoFalse(correoElectronico)){
            throw new ValidacionDeIntegridad("correo electronico registrado pero inactivo");
        }

        return usuarioRepository.findByCorreoElectronico(correoElectronico);
    }
}