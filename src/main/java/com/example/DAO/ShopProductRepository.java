package com.example.DAO;

import com.example.Entity.ShopProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ShopProductRepository extends JpaRepository<ShopProduct, BigInteger> {
}
