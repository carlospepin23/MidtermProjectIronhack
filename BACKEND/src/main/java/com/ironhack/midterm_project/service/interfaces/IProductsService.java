package com.ironhack.midterm_project.service.interfaces;
import com.ironhack.midterm_project.DTO.product_dto.*;
import com.ironhack.midterm_project.model.Product;

import java.util.List;

public interface IProductsService {
    List<Product> getAllProducts();
    Product getProductById(Integer id);
    void addNewProduct(Product product);
    void updateProductName(ProductNameDTO productNameDTO, Integer id);
    void updateProductPrice(ProductPriceDTO productPriceDTO, Integer id);
    void updateProductStock(ProductStockDTO productStockDTO, Integer id);
    void updateProductDepartment(ProductDepartmentDTO productDepartmentDTO, Integer id);
    void updateProductInformation(ProductDTO productDTO, Integer id);
    void updateProductInformation(ProductDTO productDTO, String name);
    void deleteProduct(Integer id);
    void deleteAllProductsExceptId(Integer id);

}