package com.crud.kipper.crud.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, String> {
}
