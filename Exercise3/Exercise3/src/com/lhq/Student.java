/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lhq;

import java.util.Scanner;

/**
 *
 * @author redar
 */
public class Student extends Human {
    
    private String grade;

    public Student() {
    }

    public Student(String grade, String firstName, String lastName) {
        super(firstName, lastName);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input first name: ");
        firstName = scan.nextLine();
        
        System.out.print("Input last name: ");
        lastName = scan.nextLine();
        
        System.out.print("Input grade: ");
        grade = scan.next();
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + " ,grade=" + grade + '}';
    }

 
}
