/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.ias.products.types.application.domain;

/**
 *
 * @author raque
 */
public class TypeProduct {
    
    private final TypeId typeId;
    private final TypeName typeName;

    /*
      Constructor
    */
    public TypeProduct(TypeId typeId, TypeName typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    /*
      Getters 
    */
    public TypeId getTypeId() {
        return typeId;
    }

    public TypeName getTypeName() {
        return typeName;
    }
    
    /*
      Method To String
    */

    @Override
    public String toString() {
        return "TypeProduct{" + "typeId=" + typeId + ", typeName=" + typeName + '}';
    }
    
}
