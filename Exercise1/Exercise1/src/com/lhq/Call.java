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
public class Call {
    
    private String date;
    private String time;
    private String dialedPhoneNumber;
    private int duration;
    
    public Call() {
    }

    public Call(String date, String time, String dialedPhoneNumber, int duration) {
        this.date = date;
        this.time = time;
        this.dialedPhoneNumber = dialedPhoneNumber;
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDialedPhoneNumber() {
        return dialedPhoneNumber;
    }

    public void setDialedPhoneNumber(String dialedPhoneNumber) {
        this.dialedPhoneNumber = dialedPhoneNumber;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void addCall() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Date: ");
        date = scan.nextLine();

        System.out.print("Time: ");
        time = scan.nextLine();

        System.out.print("DialedPhoneNumber: ");
        dialedPhoneNumber = scan.nextLine();

        System.out.print("Duration: ");
        duration = scan.nextInt();
        
    }

    @Override
    public String toString() {
        return "Call [date=" + date + ", dialedPhoneNumber=" + dialedPhoneNumber + ", duration=" + duration + ", time="
                + time + "]";
    }
}
