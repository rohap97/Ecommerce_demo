package com.dekucodes.dreamshops.dto;

import com.dekucodes.dreamshops.model.Category;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CartItemDto {
    private Long itemId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private ProductDto product;
//    private int inventory;
//    private String description;
//    private Category category;
//    private List<ImageDto> images;
}
