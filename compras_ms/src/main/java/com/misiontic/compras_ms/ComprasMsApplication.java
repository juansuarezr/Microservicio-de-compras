package com.misiontic.compras_ms;

import com.misiontic.compras_ms.models.Carrito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@SpringBootApplication
@RestController
public class ComprasMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComprasMsApplication.class, args);
	}


	@GetMapping
	public Carrito show_list() {

		Map<String, Integer> hm
				= new HashMap<String, Integer>();

		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));

		Carrito carrito_prueba = new Carrito(hm);

		return carrito_prueba;
	}
}
