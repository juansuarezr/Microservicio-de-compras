package com.misiontic.compras_ms.models;

import java.util.ArrayList;
import java.util.Map;

public class Carrito {

    private String productId;
    private Integer cantidad;
    private Float valorUnidad;

    public Carrito(String productId, Integer cantidad, Float valorUnidad) {
        this.productId = productId;
        this.cantidad = cantidad;
        this.valorUnidad = valorUnidad;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(Float valorUnidad) {
        this.valorUnidad = valorUnidad;
    }
}
