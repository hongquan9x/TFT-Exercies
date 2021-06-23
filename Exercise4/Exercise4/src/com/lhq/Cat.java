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
public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age, String name, String sex) {
        super(age, name, sex);
    }

    
    @Override
    public void sound() {
        super.sound();
        System.out.println("CAT");
    }
    
    
}
