package com.example.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

@Data
@Entity
public class ShopProduct {

    @Id
    private BigInteger ID_bigint;

    private String name_varchar;
    private BigDecimal shopPrice_decimal;
    private BigDecimal salePrice_decimal;
    private Long score_int;
    private boolean disable_bit;
    private Timestamp createTime_datetime;
    private boolean isRecommend_bit;
    private String img_varchar;
    private String itemName_varchar;
    private String model_varchar;
    private String priceUnit_varchar;
    private Long sort_int;


}
