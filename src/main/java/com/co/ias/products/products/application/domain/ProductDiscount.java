/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.ias.products.products.application.domain;

import org.apache.commons.lang3.Validate;

/**
 *
 * @author raque
 */
public class ProductDiscount {
    private final Integer value;

    public ProductDiscount(Integer value) {
        Validate.notNull(value, "Product Discount can't be null");
        Integer start = 0, end = 100;
        Validate.inclusiveBetween(start, end, value);
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString() ;
    }
    
    
    
}
