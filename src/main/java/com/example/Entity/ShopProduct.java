package com.example.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name="shop_product")
public class ShopProduct {

    @Id
    @Column(name="ID_bigint")
    private Long ID;

    @Column(name="name_varchar")
    private String name;
    @Column(name="shopPrice_decimal", precision = 10, scale = 2, nullable=false)
    private BigDecimal shopPrice;
    @Column(name="salePrice_decimal", precision = 10, scale = 2, nullable=false)
    private BigDecimal salePrice;
    @Column(name="score_int")
    private Long score;
    @Column(name="disable_bit")
    private boolean disable;

    @Column(name="createTime_datetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @Column(name="isRecommend_bit")
    private boolean isRecommend;
    @Column(name="img_varchar")
    private String img;
    @Column(name="itemName_varchar")
    private String itemName;
    @Column(name="model_varchar")
    private String model;
    @Column(name="priceUnit_varchar")
    private String priceUnit;
    @Column(name="sort_int")
    private Long sort;


}
