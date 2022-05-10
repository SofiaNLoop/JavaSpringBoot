/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.ias.products.products.application.models;

import com.co.ias.products.products.application.domain.Product;
import com.co.ias.products.products.application.domain.ProductDiscount;
import com.co.ias.products.products.application.domain.ProductId;
import com.co.ias.products.products.application.domain.ProductName;
import com.co.ias.products.products.application.domain.ProductPrice;
import com.co.ias.products.products.application.domain.TypeOfProduct;

/**
 *
 * @author raque
 */
public class ProductDTO {
    /*
      Product DTO Attributes
    */
    private Integer productId;
    private Integer typeOfProduct;
    private String name;
    private Integer price;
    private Integer discount;

    /*
      No Args Constructor
    */
    public ProductDTO() {
    }
    
    /*
      All Args Constructor
    */
    public ProductDTO(Integer productId, Integer typeOfProduct, String name, Integer price, Integer discount) {
        this.productId = productId;
        this.typeOfProduct = typeOfProduct;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    /*
      Method To domain
    */
    public  Product toDomain(){
        return new Product (
            new ProductId(productId),
            new ProductName(name),
            new TypeOfProduct(typeOfProduct),
            new ProductPrice(price),
            new ProductDiscount(discount)
                
        );
    }
    
    /*
      Method From domain
    */
    public static ProductDTO fromDomain(Product product){
        return new ProductDTO(
            product.getProductId().getValue(),
            product.getTypeOfProduct().getValue(),
            product.getProductName().getValue(),
            product.getProductPrice().getValue(),
            product.getProductDiscount().getValue()
            
        );
    }
    
    /*
      Getters and Setters
    */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(Integer typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    
}
