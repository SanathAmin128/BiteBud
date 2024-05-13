package com.sanath.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanath.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Optional<Cart> findByCustomer_Id(Long userId);
}
