package com.sistema.blog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.blog.dto.RoleDTO;
import com.sistema.blog.entities.Rol;
import com.sistema.blog.repositories.RolRepositorio;


@Service
public class UsuarioServicioImpl implements UsuarioServicio{

    @Autowired
	private ModelMapper modelMapper;
    @Autowired
	private RolRepositorio rolRepositorio;
    
    @Override
    public List<RoleDTO> obtenerRoles() {
         
            List<Rol> listaRoles = rolRepositorio.findAll();;

		    List<RoleDTO> contenido = listaRoles.stream().map(rol -> mapearDTO(rol))
				.collect(Collectors.toList());
            return contenido;
    }

    private RoleDTO mapearDTO(Rol rol) {
        RoleDTO roleDTO = modelMapper.map(rol, RoleDTO.class);
		return roleDTO;
    }

    
}
