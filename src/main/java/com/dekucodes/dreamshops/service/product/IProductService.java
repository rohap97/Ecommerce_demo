package com.dekucodes.dreamshops.service.product;

import com.dekucodes.dreamshops.dto.ProductDto;
import com.dekucodes.dreamshops.model.Product;
import com.dekucodes.dreamshops.request.AddProductRequest;
import com.dekucodes.dreamshops.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);

    void deleteProductById(Long id);
    Product updateProductById(ProductUpdateRequest request, Long id);

    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}
