package com.sistema.blog.dto;

import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sistema.blog.entities.Comentario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PublicacionDTO {

	private Long id;
	
	@NotEmpty
	@Size(min = 2,message = "El titulo de la publicación deberia tener al menos 2 caracteres")
	private String titulo;
	
	@NotEmpty
	@Size(min = 10,message = "La descripción de la publicación deberia tener al menos 10 caracteres")
	private String descripcion;
	
	@NotEmpty
	private String contenido;
	
	private Set<Comentario> comentarios;

	

}
