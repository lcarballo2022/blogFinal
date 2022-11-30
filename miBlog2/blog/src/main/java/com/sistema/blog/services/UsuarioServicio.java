package com.sistema.blog.services;

import java.util.List;
import com.sistema.blog.dto.RoleDTO;

public interface UsuarioServicio {

    public List<RoleDTO> obtenerRoles();
    
}
