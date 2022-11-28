package com.sistema.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.blog.entities.Comentario;

public interface ComentarioRepositorio extends JpaRepository<Comentario, Long>{

	public List<Comentario> findByPublicacionId(long publicacionId); 
	
}
