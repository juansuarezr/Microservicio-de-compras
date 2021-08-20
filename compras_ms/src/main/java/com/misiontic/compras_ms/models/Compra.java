package com.misiontic.compras_ms.models;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.ArrayList;

public class Compra {
    @Id
    private String id;

    private String userId;
    private ArrayList<Carrito> productos;
    private Float total;
    private Date fecha;


    public Compra(String id, String userId, ArrayList<Carrito> productos, Float total, Date fecha) {
        this.id = id;
        this.userId = userId;
        this.productos = productos;
        this.total = total;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList<Carrito> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Carrito> productos) {
        this.productos = productos;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
