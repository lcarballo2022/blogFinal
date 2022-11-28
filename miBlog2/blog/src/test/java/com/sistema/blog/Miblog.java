package com.sistema.blog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.sistema.blog.controllers.AuthControlador;
import com.sistema.blog.dto.RegistroDTO;


import lombok.NoArgsConstructor;

@SpringBootTest
@NoArgsConstructor
class Miblog {

	@Autowired
	private AuthControlador authControlador;
	
	@Test
	void contextLoads() {

		RegistroDTO registroDTO= new RegistroDTO("Juan","juancinto","juan@kkk.com", "1234","ROLE_ADMIN");
	//	ResponseEntity<?>  rta= authControlador.registrarUsuario(registroDTO);
		/*if (rta!=null){
			assertEquals(rta.getStatusCode(),HttpStatus.OK );
		}*/
		if (registroDTO!=null){
			System.out.println("ff");
		}
	}

}
