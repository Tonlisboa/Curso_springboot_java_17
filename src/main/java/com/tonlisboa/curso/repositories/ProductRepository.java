package com.tonlisboa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tonlisboa.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
