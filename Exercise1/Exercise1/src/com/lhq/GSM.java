/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lhq;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author redar
 */
public class GSM {

    private String model;
    private String manufacturer;
    private float price;
    private String owner;
    private Battery batteryCharacteristics;
    private Display displayCharacteristics;
    private List<Call> callHistory = new ArrayList<>();

    public static final float PRICE_PER_MINUTE = 0.37F;

    public static GSM iPhone4S = new GSM("iPhone 4S", "Apple");

    public GSM() {
    }

    public GSM(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public GSM(String model, String manufacturer, float price, String owner, Battery batteryCharacteristics,
              Display displayCharacteristics, List<Call> callHistory) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.owner = owner;
        this.batteryCharacteristics = batteryCharacteristics;
        this.displayCharacteristics = displayCharacteristics;
        this.callHistory = callHistory;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Battery getBatteryCharacteristics() {
        return batteryCharacteristics;
    }

    public void setBatteryCharacteristics(Battery batteryCharacteristics) {
        this.batteryCharacteristics = batteryCharacteristics;
    }

    public Display getDisplayCharacteristics() {
        return displayCharacteristics;
    }

    public void setDisplayCharacteristics(Display displayCharacteristics) {
        this.displayCharacteristics = displayCharacteristics;
    }

    public List<Call> getCallHistory() {
        return callHistory;
    }

    public void setCallHistory(List<Call> callHistory) {
        this.callHistory = callHistory;
    }

    public void inputInformations() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Model: ");
        model = scan.next();

        System.out.print("Manufacturer: ");
        manufacturer = scan.next();

        System.out.print("Price: ");
        price = scan.nextFloat();

        System.out.print("Owner: ");
        owner = scan.next();

        batteryCharacteristics = new Battery();
        batteryCharacteristics.inputInformations();

        displayCharacteristics = new Display();
        displayCharacteristics.inputInformations();

    }

    public void displayAllInformation() {
        System.out.println("Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
        System.out.println("Owner: " + owner);

        if (batteryCharacteristics == null || displayCharacteristics == null) {
            System.out.println("NULL");
        } else {
            batteryCharacteristics.toString();
            displayCharacteristics.toString();
        }

    }

    public void addCalls() {
        Scanner scan = new Scanner(System.in);
        int quantity = 0;
        System.out.print("How much history calls do you want to input: ");
        if (scan.hasNextInt()) {
            quantity = scan.nextInt();
        }

        for (int i = 0; i < quantity; i++) {
            System.out.println("Input history call number " + (i + 1) + " :");
            Call call = new Call();
            call.addCall();

            callHistory.add(call);
        }

    }

    public void deleteCall() {
        Scanner scan = new Scanner(System.in);

        System.out.println("List of call history: ");
        for (int i = 0; i < callHistory.size(); i++) {
            System.out.println("Information of call number " + (i + 1) + " :");
            System.out.println(callHistory.get(i).toString());
        }

        try {
            System.out.println("Choose the history line to delele: ");
            int chosen = scan.nextInt();
            callHistory.remove(chosen);
        } catch (Exception e) {
            System.out.println("Wrong index!");
        }

    }

    public float totalPrice() {
        float totalPrice = 0;

        for (Call call : callHistory) {
            totalPrice += call.getDuration() * PRICE_PER_MINUTE;
        }

        return totalPrice;
    }
}
