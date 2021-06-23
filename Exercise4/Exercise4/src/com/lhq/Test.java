/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lhq;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author redar
 */
public class Test {

    /**
     * @param animals 
     */
    
    public static void averageOfAge(List<Animal> animals) {
        float totalOfCatsAge = 0, totalOfKittensAge = 0, totalOfDogsAge = 0;
        int quantityOfCats = 0, quantityOfKittens = 0, quantityOfDogs = 0;
        
        for (Animal animal : animals) {
            if (animal.getClass().getName().equals(animal.getClass().getPackage().getName() + "." + "Cat")) {
                quantityOfCats++;
                totalOfCatsAge += animal.getAge();
                
            } else if (animal instanceof Kitten) {
                quantityOfKittens++;
                totalOfKittensAge += animal.getAge();
                
            } else if (animal instanceof Dog) {
                quantityOfDogs++;
                totalOfDogsAge += animal.getAge();
            }
        }
        
        System.out.println("Average age of Cats: "+ totalOfCatsAge / quantityOfCats);
        System.out.println("Average age of Kittens: "+ totalOfKittensAge / quantityOfKittens);
        System.out.println("Average age of Dogs: "+ totalOfDogsAge / quantityOfDogs);
    }
    
    public static void main(String[] args) {
        
        List<Animal> animals = new ArrayList<>();
        
        Cat cat1 = new Cat(1, "cat1", "male");
        Cat cat2 = new Cat(2, "cat2", "male");
        Cat cat3 = new Cat(15, "cat3", "male");
        
        Kitten kitten1 = new Kitten(2, "kitten1", "");
        Kitten kitten2 = new Kitten(3, "kitten2", "");
        
        Dog dog1 = new Dog(5, "dog1", "male");
        Dog dog2 = new Dog(9, "dog2", "male");
        
        animals.add(cat1);
        animals.add(cat2);
        animals.add(kitten1);
        animals.add(kitten2);
        animals.add(cat3);
        animals.add(dog1);
        animals.add(dog2);
        
        //Calculate the average age
        Test.averageOfAge(animals);
        
    }

    
}
