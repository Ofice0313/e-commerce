package com.devcaleb.ecommerce.repositories;

import com.devcaleb.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
