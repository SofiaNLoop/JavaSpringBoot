/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.ias.products.shared.models;

import org.apache.commons.lang3.Validate;

/**
 *
 * @author raque
 */
public class Page {
    private final Integer value;
    
    public Page(Integer value) {
        Integer page = value  != null ? value: 1;
        Validate.exclusiveBetween(1, 10, value, "Page value should be between 1 and 10");
        this.value = page;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString() ;
    }
    
    
    
}
