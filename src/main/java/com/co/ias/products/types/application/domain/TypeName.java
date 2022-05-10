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
public class TypeName {
    
    private final String value;

    public TypeName(String value) {
        Validate.notNull(value, "Product Name can't be null");
        Validate.isTrue( value.length() < 40, "Product Name can't be longer than 40 characters" );
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
    
    
    
    
}
