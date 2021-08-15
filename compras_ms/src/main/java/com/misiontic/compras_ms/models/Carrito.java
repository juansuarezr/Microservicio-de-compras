package com.misiontic.compras_ms.models;

import java.util.Map;

public class Carrito {

    private Map<String, Integer> dictCarrito;

    public Carrito(Map<String, Integer> dictCarrito) {
        this.dictCarrito = dictCarrito;
    }

    public Map<String, Integer> getDictCarrito() {
        return dictCarrito;
    }

    public void setDictCarrito(Map<String, Integer> dictCarrito) {
        this.dictCarrito = dictCarrito;
    }
}
