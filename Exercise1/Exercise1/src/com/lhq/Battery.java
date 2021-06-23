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
public class Battery {

    private String model;
    private float hoursIdle;
    private float hoursTalk;
    private EnumBatteryType type;

    public Battery() {
    }

    public Battery(String model, float hoursIdle, float hoursTalk, EnumBatteryType type) {
        this.model = model;
        this.hoursIdle = hoursIdle;
        this.hoursTalk = hoursTalk;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getHoursIdle() {
        return hoursIdle;
    }

    public void setHoursIdle(float hoursIdle) {
        this.hoursIdle = hoursIdle;
    }

    public float getHoursTalk() {
        return hoursTalk;
    }

    public void setHoursTalk(float hoursTalk) {
        this.hoursTalk = hoursTalk;
    }

    public EnumBatteryType getType() {
        return type;
    }

    public void setType(EnumBatteryType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Battery [hoursIdle=" + hoursIdle + ", hoursTalk=" + hoursTalk + ", model=" + model + ", type=" + type
                  + "]";
    }

    public void inputInformations() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Model of battery: ");
        model = scan.next();

        System.out.print("Hours idle: ");
        hoursIdle = scan.nextFloat();

        System.out.print("Hours talk: ");
        hoursTalk = scan.nextFloat();

        try {
            System.out.print("Type (Li_Ion, NiMH, NiCd): ");
            type = EnumBatteryType.valueOf(scan.next());
        } catch (Exception e) {
            System.out.println("Wrong type!");
        }

    }
}
