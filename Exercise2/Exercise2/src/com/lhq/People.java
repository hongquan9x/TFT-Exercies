/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lhq;

/**
 *
 * @author redar
 */
public abstract class People {
    
    protected String name;
    protected String optionalComment;

    public People() {
    }

    public People(String name, String optionalComment) {
        this.name = name;
        this.optionalComment = optionalComment;
    }

    
}
