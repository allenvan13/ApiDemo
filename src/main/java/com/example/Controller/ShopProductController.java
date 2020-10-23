package com.example.Controller;

import com.example.DAO.ShopProductRepository;
import com.example.Entity.ShopProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;

@RestController
public class ShopProductController {

    @Resource
    private ShopProductRepository shopProductRepository;

//    @Autowired
//    public ShopProductController(ShopProductRepository shopProductRepository) {
//        this.shopProductRepository = shopProductRepository;
//    }


    @GetMapping("/shopProduct")
    public List<ShopProduct> findAll(){
        return shopProductRepository.findAll();
    }

    @GetMapping("/shopProduct_my")
    public List<ShopProduct> findById(@RequestParam(value = "id") Long id){
        return shopProductRepository.findByID(id);
    }
}
