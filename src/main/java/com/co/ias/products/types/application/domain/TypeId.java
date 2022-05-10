/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.ias.products.types.application.domain;

import org.apache.commons.lang3.Validate;

/**
 *
 * @author raque
 */
public class TypeId {
    
    private final Integer value;

    public TypeId(Integer value) {
        Validate.notNull(value, "Type ID can't be null");
        Validate.isTrue( value < 99999999, "Product ID can't be longer than 10 characters");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  value.toString() ;
    }
    
    
    
}
