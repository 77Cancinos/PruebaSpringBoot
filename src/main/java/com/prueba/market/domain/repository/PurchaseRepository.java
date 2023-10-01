package com.prueba.market.domain.repository;

import com.prueba.market.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<Purchase> getAll();
    Optional<List<Purchase>> getByCliente(String clienteId);
    Purchase save(Purchase purchase);

}
