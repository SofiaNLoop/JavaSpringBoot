/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.ias.products.products.application.ports.out;

import com.co.ias.products.products.application.domain.Product;
import com.co.ias.products.products.application.domain.ProductId;
import com.co.ias.products.shared.models.PageQuery;
import java.util.List;

/**
 *
 * @author raque
 */
public interface ProductRepository {
    Integer store(Product product);
    Product getId(ProductId productId);
    void update(Product product);
    void delete(ProductId productId);
    List<Product> getProducts(PageQuery pageQuery);
}
