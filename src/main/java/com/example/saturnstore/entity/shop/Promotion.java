package com.example.saturnstore.entity.shop;

import com.example.saturnstore.entity.product.AlterPrice;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Set;

public class Promotion {

    private long id;
    private String name;
    private BigDecimal discount;
    private Shop owner;
    private PromotionType promotionType;
    private Instant startTime;
    private Instant endTime;
    private Set<AlterPrice> prices;

}
