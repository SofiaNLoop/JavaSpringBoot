/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.ias.products.types.application.models;

import com.co.ias.products.types.application.domain.TypeId;
import com.co.ias.products.types.application.domain.TypeName;
import com.co.ias.products.types.application.domain.TypeProduct;

/**
 *
 * @author raque
 */
public class TypeProductDTO {
    
    /*
      Type Product DTO Attributes
    */
    private Integer typeId;
    private String typeName;

    /*
      No Args Constructor
    */
    public TypeProductDTO() {
    }

    /*
      All Args Constructor
    */
    public TypeProductDTO(Integer typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }
    
    /*
      Method To domain
    */
    public  TypeProduct toDomain(){
        return new TypeProduct (
            new TypeId(typeId),
            new TypeName(typeName)
            
                
        );
    }
    
    /*
      Method From domain
    */
    public static TypeProductDTO fromDomain(TypeProduct typeProduct){
        return new TypeProductDTO(
            
            typeProduct.getTypeId().getValue(),
            typeProduct.getTypeName().getValue()
            
            
            
        );
    }
    
    /*
      Getters and Setters
    */

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    
    
}
