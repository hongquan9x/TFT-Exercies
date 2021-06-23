/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lhq;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author redar
 */
public class GSMCallHistoryTest {

    public static void main(String[] args) throws InterruptedException {
        GSM gsmTest = new GSM();
        List<Call> callHistory = gsmTest.getCallHistory();

        Scanner scan = new Scanner(System.in);
        int chosen = 0;
        do {
            System.out.println(
                      "1. Create an instance GSM & add a few calls\n"
                      + "2. Display the information about the calls\n"
                      + "3. Calculate total price of the calls in the history\n"
                      + "4. Remove the longest call from the history and calculate the total price again\n"
                      + "5. Clear all the history\n"
                      + "6. Exit");
            
            System.out.print("Your chosen is: ");
            if (scan.hasNextInt()){
                chosen = scan.nextInt();
            }
            

            switch (chosen) {
                case 1:
                    gsmTest.inputInformations();
                    gsmTest.addCalls();
                    break;

                case 2:
                    callHistory = gsmTest.getCallHistory();
                    for (Call call : callHistory) {
                        System.out.println(call.toString());
                    }

                    break;

                case 3:
                    System.out.println("Total price :" + gsmTest.totalPrice());

                    break;

                case 4:
                    int maxDuration = callHistory.get(0).getDuration();
                    int indexOfMax = 0;
                    for (Call call : callHistory) {
                        if (call.getDuration() > maxDuration) {
                            maxDuration = call.getDuration();
                            indexOfMax = callHistory.indexOf(call);
                        }
                    }
                    callHistory.remove(indexOfMax);
                    gsmTest.setCallHistory(callHistory);
                    System.out.println("Total price :" + gsmTest.totalPrice());

                    break;

                case 5:
                    gsmTest.setCallHistory(null);

                    break;

            }

        } while (chosen != 6);
    }

}
