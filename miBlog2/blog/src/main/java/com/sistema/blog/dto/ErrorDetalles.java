package com.sistema.blog.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetalles {

	private Date marcaDeTiempo;
	private String mensaje;
	private String detalles;



}
