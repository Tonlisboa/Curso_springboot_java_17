package com.tonlisboa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tonlisboa.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
