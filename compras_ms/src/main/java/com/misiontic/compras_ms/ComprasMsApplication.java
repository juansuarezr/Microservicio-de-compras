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
	public String hello() {
		return "Microservicio de compras";
	}
}
