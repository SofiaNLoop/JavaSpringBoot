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
public class TypeOfProduct {
    private final Integer value;

    public TypeOfProduct(Integer value) {
        Validate.notNull(value, "Type of Product can't be null");
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
