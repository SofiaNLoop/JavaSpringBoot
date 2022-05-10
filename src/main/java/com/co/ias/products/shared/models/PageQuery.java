/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.ias.products.shared.models;

/**
 *
 * @author raque
 */
public class PageQuery {
    
    private final Page page;
    private final PageSize pageSize;

    public PageQuery(Page page, PageSize pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }

    public Page getPage() {
        return page;
    }

    public PageSize getPageSize() {
        return pageSize;
    }

    
    
    
}
