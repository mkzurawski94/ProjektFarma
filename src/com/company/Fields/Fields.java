package com.company.Fields;

import com.company.Crops.Crops;

import java.util.Random;

public class Fields {
    private int fieldId;
    private static int fieldIdCounter = 0;

    Double fieldValue;
    Double fieldArea;
    Crops crops;
    private static double oneArValue = 612.0;

    public Fields()
    {
        this.fieldId= fieldIdCounter++;
        Double min = 10.0;  // Set To Your Desired Min Value
        Double max = 20.0; // Set To Your Desired Max Value
        double x = (Math.random() * ((max - min) + 1)) + min;   // This Will Create A Random Number Inbetween Your Min And Max.
        double xrounded = Math.round(x);   // Creates Answer To The Nearest 100 th, You Can Modify This To Change How It Rounds.
//        System.out.println(xrounded);     // This Will Now Print Out The Rounded, Random Number.
        this.fieldArea = xrounded/100.0;
        this.fieldValue=xrounded*oneArValue;
        System.out.println("Added field: "+ this);
    }
    @Override
    public String toString() {
        return
                "Id." + fieldId +
                ", fieldAerea = " + fieldArea + " ha "+ " fieldValue =  " + fieldValue + "zł";
    }


}
