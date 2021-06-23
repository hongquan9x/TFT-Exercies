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
public class Kitten extends Cat {

    public Kitten() {
    }

    public Kitten(int age, String name, String sex) {
        super(age, name, "female");
    }

    
    @Override
    public void sound() {
        super.sound();
        System.out.println("KITTEN");
    }
      
}
