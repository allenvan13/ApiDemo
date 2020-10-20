package com.example.Controller;

import com.example.DAO.ShopProductRepository;
import com.example.Entity.ShopProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopProductController {

    private ShopProductRepository shopProductRepository;

    @Autowired
    public ShopProductController(ShopProductRepository shopProductRepository) {
        this.shopProductRepository = shopProductRepository;
    }

    @GetMapping("/shopProduct")
    public List<ShopProduct> findAll(){
        return shopProductRepository.findAll();
    }
}
