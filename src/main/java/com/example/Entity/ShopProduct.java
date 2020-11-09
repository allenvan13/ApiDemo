package com.example.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

@Data
@Entity
@Table(name="shop_product")
public class ShopProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_bigint")
    private Long ID;

    @Column(name="name_varchar")
    private String name;

    @Column(name="shop_price_decimal", nullable=false)
    private BigDecimal shopPrice = new BigDecimal("0");

    @Column(name="sale_price_decimal", nullable=false)
    private BigDecimal salePrice = new BigDecimal("0");

    @Column(name="score_int")
    private Long score = 0L;

    @Column(name="disable_bit")
    private boolean disable = false;

    @Column(name="create_time_datetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @Column(name="is_recommend_bit")
    private boolean isRecommend = false;

    @Column(name="img_varchar")
    private String img;

    @Column(name="item_name_varchar")
    private String itemName;

    @Column(name="model_varchar")
    private String model;

    @Column(name="price_unit_varchar")
    private String priceUnit;

    @Column(name="sort_int")
    private Long sort;


}
