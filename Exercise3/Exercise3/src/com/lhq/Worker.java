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
public class Worker extends Human{
    
    private float weekSalary;
    private float workHoursPerDay;
    
    public static int WORKING_DAYS_IN_WEEK = 5;
    
    public Worker() {
    }

    public Worker(float weekSalary, float workHoursPerDay, String firstName, String lastName) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    public float getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(float weekSalary) {
        this.weekSalary = weekSalary;
    }

    public float getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(float workHoursPerDay) {
        this.workHoursPerDay = workHoursPerDay;
    }
    
    public float moneyPerHour() {
        
        return (weekSalary / WORKING_DAYS_IN_WEEK / workHoursPerDay);
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input first name: ");
        firstName = scan.nextLine();
        
        System.out.print("Input last name: ");
        lastName = scan.nextLine();
        
        System.out.print("Input week salary: ");
        weekSalary = scan.nextFloat();
        
        System.out.print("Input work hours/day: ");
        workHoursPerDay = scan.nextFloat();
    }

    @Override
    public String toString() {
        return "Worker{" + "firstName=" + firstName + ", lastName=" + lastName +" ,weekSalary=" + weekSalary + ", workHoursPerDay=" + workHoursPerDay + '}';
    }
    
    
}
