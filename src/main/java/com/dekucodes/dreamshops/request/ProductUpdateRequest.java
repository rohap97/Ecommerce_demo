package com.dekucodes.dreamshops.request;

import com.dekucodes.dreamshops.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;

    //    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "category_id")
    private Category category;
}
