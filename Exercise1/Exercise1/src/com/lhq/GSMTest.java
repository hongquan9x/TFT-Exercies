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
public class GSMTest {

    private GSM[] listGSMs;
    private int quantity;

    public GSMTest() {
        listGSMs = new GSM[10];
        quantity = 0;
    }

    public void inputGSMs() {
        Scanner scan = new Scanner(System.in);

        System.out.print("How much GSM do you want to input: ");

        quantity = scan.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Input GSM number " + (i + 1) + ":");
            listGSMs[i] = new GSM();
            listGSMs[i].inputInformations();
        }

    }

    public void showGSMs() {
        for (int i = 0; i < quantity; i++) {
            System.out.println("Informations of GSM number " + (i + 1) + ":");
            listGSMs[i].displayAllInformation();
        }
    }

    public static void main(String[] args) {
        GSMTest test = new GSMTest();
        test.inputGSMs();
        test.showGSMs();
        
        System.out.println("Informations of iPhone 4S: ");
        GSM.iPhone4S.displayAllInformation();

    }

}
