/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.ias.products.types.application.ports.out;



import com.co.ias.products.shared.models.PageQuery;
import com.co.ias.products.types.application.domain.TypeId;
import com.co.ias.products.types.application.domain.TypeProduct;
import java.util.List;

/**
 *
 * @author raque
 */
public interface TypeProductRepository {
    Integer store(TypeProduct product);
    TypeProduct getId(TypeId productId);
    void update(TypeProduct product);
    void delete(TypeId productId);
    List<TypeProduct> getProducts(PageQuery pageQuery);
}
