package com.example.DAO;

import com.example.Entity.ShopProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface ShopProductRepository extends JpaRepository<ShopProduct, BigInteger> {

    List<ShopProduct> findByID(Long ID);
}
