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
public class Display {

    private String size;
    private int numberOfColor;

    public Display() {
    }

    public Display(String size, int numberOfColor) {
        this.size = size;
        this.numberOfColor = numberOfColor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumberOfColor() {
        return numberOfColor;
    }

    public void setNumberOfColor(int numberOfColor) {
        this.numberOfColor = numberOfColor;
    }

    @Override
    public String toString() {
        return "Display [numberOfColor=" + numberOfColor + ", size=" + size + "]";
    }

    public void inputInformations() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Size: ");
        size = scan.nextLine();

        System.out.print("Number of color: ");
        numberOfColor = scan.nextInt();

    }
}
