/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.ias.products;

import com.co.ias.products.products.application.domain.Product;
import com.co.ias.products.products.application.domain.ProductDiscount;
import com.co.ias.products.products.application.domain.ProductId;
import com.co.ias.products.products.application.domain.ProductName;
import com.co.ias.products.products.application.domain.ProductPrice;
import com.co.ias.products.products.application.domain.TypeOfProduct;
import com.co.ias.products.products.application.models.ProductDTO;

/**
 *
 * @author raque
 */
public class TestApplication {
    public static void main(String[] args) {
        
        try{
            ProductId productId = new ProductId(1234);
            ProductName productName = new ProductName("Cepillo");
            TypeOfProduct typeOfProduct = new TypeOfProduct(2);
            ProductPrice productPrice = new ProductPrice(21334);
            ProductDiscount productDiscount = new ProductDiscount(80);
            
            Product product = new Product(productId, productName, typeOfProduct, productPrice, productDiscount);
            
            // Test DTO
            // OutPut
            ProductDTO productDTO = ProductDTO.fromDomain(product);
            // InPut          
            Product product1 = productDTO.toDomain();
            
        } catch(NullPointerException exception) {
            System.out.println("Error:"+ exception.getMessage() );
        }
        
        
    }
}
