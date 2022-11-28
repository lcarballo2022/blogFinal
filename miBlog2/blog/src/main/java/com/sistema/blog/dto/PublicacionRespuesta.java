package com.sistema.blog.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PublicacionRespuesta {

	private List<PublicacionDTO> contenido;
	private int numeroPagina;
	private int medidaPagina;
	private long totalElementos;
	private int totalPaginas;
	private boolean ultima;

	

}
