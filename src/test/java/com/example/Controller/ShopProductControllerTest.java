package com.example.Controller;

import com.example.Entity.ShopProduct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopProductControllerTest {

    @Autowired
    private ShopProductController shopProductController;

    @Test
    public void test001(){
        Long id = Long.valueOf(1);
        List<ShopProduct> sp = shopProductController.findById(id);
        System.out.println(sp);
    }
}