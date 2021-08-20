package com.misiontic.compras_ms.controllers;


import com.misiontic.compras_ms.exceptions.UserNotFoundException;
import com.misiontic.compras_ms.models.Carrito;
import com.misiontic.compras_ms.models.Compra;
import com.misiontic.compras_ms.repositories.CompraRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class CompraController {
    private final CompraRepository compraRepository;

    public CompraController(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;

        Carrito elemento1 = new Carrito("001",2,10000F);
        Carrito elemento2 = new Carrito("001",2,10000F);

        ArrayList arrayCarrito = new ArrayList();
        arrayCarrito.add(elemento1);
        arrayCarrito.add(elemento2);
        //Seed
        Compra newCompra001 = new Compra("004", "001", arrayCarrito, 10000F, new Date());
        Compra newCompra002 = new Compra("005", "002", arrayCarrito, 3000F, new Date());

        this.compraRepository.save(newCompra001);
        this.compraRepository.save(newCompra002);
    }

    @GetMapping("/compras") //Se listan todas las compras
    List<Compra> getAllCompra(){ return compraRepository.findAll();}

    @GetMapping("/compras/{userId}")  //Se listan todas las compras de un usuario
    List<Compra> getCompra(@PathVariable String userId) {
        List<Compra> consulta = compraRepository.findByUserId(userId);
        if (consulta.isEmpty()){
            throw new UserNotFoundException("No se encontraron compras asociadas al usuario: " + userId);
        }
        return compraRepository.findByUserId(userId);
    }

    @PostMapping("/comprar") //Se crea un registro de compra
    Compra newCompra(@RequestBody Compra compra){
        compra.setFecha(new Date());
        return compraRepository.save(compra);
    }

}

