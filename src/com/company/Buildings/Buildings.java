package com.company.Buildings;

import com.company.Animals.FarmAnimals.FarmAnimals;
import com.company.Animals.Pets.Pets;
import com.company.SaleAble;

import java.util.ArrayList;
import java.util.Random;

public class Buildings {
    public Double buildingsValue;
    String buildingsName;
    private Integer capacity;// number of animal at now
    Integer maxCapacity;//maximum number of animal can be added
    ArrayList<FarmAnimals> farmAnimals = new ArrayList<FarmAnimals>();//list of animal in building
    ArrayList<Pets> petAnimals = new ArrayList<Pets>();//list of pet in building
    public final int DEFAULT_DOGHOUSE_CAPACITY = 50;
    public final double DEFAULT_DOGHOUSE_BUILDINGSVALUE = 50000.0;
    public final int DEFAULT_CHICKENBARN_CAPACITY = 100;
    public final double DEFAULT_CHICKENBARN_BUILDINGSVALUE = 100000.0;
    public final int DEFAULT_COWBARN_CAPACITY = 100;
    public final double DEFAULT_COWBARN_BUILDINGSVALUE = 200000;
    public final int DEFAULT_PIGBARN_CAPACITY = 200;
    public final double DEFAULT_PIGBARN_BUILDINGSVALUE = 200000.0;
    public final int DEFAULT_DUCKBARN_CAPACITY = 100;
    public final double DEFAULT_DUCKBARN_BUILDINGSVALUE = 10000.0;
    public final int DEFAULT_RABBITHOUSE_CAPACITY = 400;
    public final double DEFAULT_RABBITHOUSE_BUILDINGSVALUE = 185000;

    public Buildings() {


    }

    public Buildings(String buildingsName) {
        if (buildingsName.equals("Dog House")) {
            maxCapacity = DEFAULT_DOGHOUSE_CAPACITY;
            buildingsValue= DEFAULT_DOGHOUSE_BUILDINGSVALUE ;
        } else {
            if (buildingsName.equals("Chicken Barn")) {
                maxCapacity = DEFAULT_CHICKENBARN_CAPACITY;
                buildingsValue= DEFAULT_CHICKENBARN_BUILDINGSVALUE ;
            } else {
                if (buildingsName.equals("Cow Barn")) {
                    maxCapacity = DEFAULT_COWBARN_CAPACITY;
                    buildingsValue= DEFAULT_COWBARN_BUILDINGSVALUE ;
                } else {
                    if (buildingsName.equals("Pig Barn")) {
                        maxCapacity = DEFAULT_PIGBARN_CAPACITY;
                        buildingsValue= DEFAULT_PIGBARN_BUILDINGSVALUE ;
                    } else {
                        if (buildingsName.equals("Duck Barn")) {
                            maxCapacity = DEFAULT_DUCKBARN_CAPACITY;
                            buildingsValue= DEFAULT_DUCKBARN_BUILDINGSVALUE ;
                        } else {
                            if (buildingsName.equals("Rabbit House")) {
                                buildingsValue= DEFAULT_RABBITHOUSE_BUILDINGSVALUE ;
                                maxCapacity = DEFAULT_RABBITHOUSE_CAPACITY;
                            }
                        }
                    }
                }
            }
        }
        this.buildingsName = buildingsName;


    }

    public String buildingGenarator() //generate random farm
    {
        Buildings[] building = new Buildings[6];
        building[0] = new Buildings("Dog House");
        building[1] = new Buildings("Chicken Barn");
        building[2] = new Buildings("Cow Barn");
        building[3] = new Buildings("Pig Barn");
        building[4] = new Buildings("Duck Barn");
        building[5] = new Buildings("Rabbit House");

        Random rand = new Random();
        int x = 0 + rand.nextInt((5) + 1);
//        System.out.println("Added " + building[x].buildingsName + " to your farm");
        return building[x].buildingsName;
    }


    @Override
    public String toString() {
        return "Name of building = '" + buildingsName + '\'' +
                ", maximum capacity=" + maxCapacity;
    }
}
