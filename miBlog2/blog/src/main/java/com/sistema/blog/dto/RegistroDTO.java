package com.sistema.blog.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RegistroDTO {

	private String nombre;
	private String username;
	private String email;
	private String password;
	private String role;

	
}
