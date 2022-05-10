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
public class PageSize {
    
    private final Integer value;

    public PageSize(Integer value) {
        Integer pageSize = value != null ? value : 1;
        Validate.inclusiveBetween(10, 30, pageSize, "Page Size should be between 10 and 30");
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
