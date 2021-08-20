package com.misiontic.compras_ms.repositories;

import com.misiontic.compras_ms.models.Compra;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CompraRepository extends MongoRepository <Compra, String> {
    List<Compra> findByUserId (String userId);
}
