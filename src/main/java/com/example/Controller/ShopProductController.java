package com.example.Controller;

import com.example.DAO.ShopProductRepository;
import com.example.Entity.ShopProduct;
import com.example.util.DateUtil;
import com.example.util.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
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

    @PostMapping("/postInfo")
    public String postInfo(@RequestHeader("User-Agent") String userAgent,@RequestHeader("Accept") String accept,
                           @RequestHeader("Accept-Language") String acceptLanguage,
                           @RequestHeader("Accept-Encoding") String acceptEncoding,
                           @RequestHeader("Cookie") String cookie,
                           @RequestHeader("Connection") String conn) {
            // 打印请求头信息
            System.out.println("Cookie = " + cookie);
            System.out.println("Connection = " + conn);
            System.out.println("Accept = " + accept);
            System.out.println("Accept-Language = " + acceptLanguage);
            System.out.println("Accept-Encoding = " + acceptEncoding);
            System.out.println("User-Agent = " + userAgent);
            return "post无参请求成功";
    }

    @PostMapping("/postShopProduct1")
    public String postWithParam1(@RequestBody ShopProduct shopProduct) {
        System.out.println(shopProduct);
        shopProductRepository.save(shopProduct);
        return "post带参请求成功,参数shopProduct:"+ shopProduct;
    }

    @PostMapping("/postShopProduct2")
    public String postWithParam2(@RequestParam String name) {
        ShopProduct shopProduct = new ShopProduct();
        shopProduct.setName(name);
        shopProduct.setCreateTime(DateUtil.getCurrontTime());
        shopProduct.setID(MyUtil.getGuid());
        shopProductRepository.save(shopProduct);
        System.out.println(shopProduct);
        return "post带参请求成功,参数name:"+ name;
    }


}
