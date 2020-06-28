package com.company;

import com.company.Animals.Animals;
import com.company.Animals.FarmAnimals.FarmAnimals;
import com.company.Animals.Pets.Pets;
import com.company.Buildings.Buildings;
import com.company.Fields.Fields;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Farm {
    String farmName;
    public List<Buildings> buildings = new ArrayList<Buildings>();
    public List<Fields> fields = new ArrayList<Fields>();

    public void generateFarm() {
        this.buildingsGenerator();
        this.fieldsGenerator();


    }

    public void buildingsGenerator() {
        Buildings temporaryBuilding = new Buildings();//generate new build
        Buildings temporaryBuilding2 = new Buildings(temporaryBuilding.buildingGenarator());//create random new build with name and capacity
        buildings.add(temporaryBuilding2);
    }

    public void fieldsGenerator() {
        Fields temporaryField = new Fields();
        fields.add(temporaryField);
    }

    public void buyBuildings(Player owner) {
        System.out.println("Choose what building you want buy");
        System.out.println("1.Dog House");
        System.out.println("2.ChickenBarn");
        System.out.println("3.Cow Barn");
        System.out.println("4.PigBarn");
        System.out.println("5.DuckBarn");
        System.out.println("6.Rabbit House");
        System.out.println("Type number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number) {
            case 1:
                Buildings tempBuild1 = new Buildings("Dog House");
                if (owner.getCash() > tempBuild1.buildingsValue) {
                    buildings.add(tempBuild1);
                    owner.setCash(owner.getCash()-tempBuild1.buildingsValue);
                } else {
                    System.out.println("Not enough money");
                }
                break;
            case 2:
                Buildings tempBuild2 = new Buildings("Chicken Barn");
                if (owner.getCash() > tempBuild2.buildingsValue)
            {
                buildings.add(tempBuild2);
                owner.setCash(owner.getCash()-tempBuild2.buildingsValue);
            }
                else{
                System.out.println("Not enough money");
            }
            break;
            case 3:
                Buildings tempBuild3 = new Buildings("Cow Barn");
                if (owner.getCash() > tempBuild3.buildingsValue)
            {
                buildings.add(tempBuild3);
                owner.setCash(owner.getCash()-tempBuild3.buildingsValue);
            }
                else{
                System.out.println("Not enough money");
            }
            break;
            case 4:
                Buildings tempBuild4 = new Buildings("Pig Barn");
                if (owner.getCash() > tempBuild4.buildingsValue)
            {
                buildings.add(tempBuild4);
                owner.setCash(owner.getCash()-tempBuild4.buildingsValue);
            }
                else{
                System.out.println("Not enough money");
            }
            break;
            case 5:
                Buildings tempBuild5 = new Buildings("Duck Barn");
                if (owner.getCash() > tempBuild5.buildingsValue)
            {
                buildings.add(tempBuild5);
                owner.setCash(owner.getCash()-tempBuild5.buildingsValue);
            }
                else{
                System.out.println("Not enough money");
            }
            break;
            case 6:
                Buildings tempBuild6 = new Buildings("Rabbit House");
                if (owner.getCash() > tempBuild6.buildingsValue)
            {
                buildings.add(tempBuild6);
                owner.setCash(owner.getCash()-tempBuild6.buildingsValue);
            }
                else{
                System.out.println("Not enough money");
            }
            break;
            default:
                System.out.println("exit");
        }
        System.out.println("Your money now is:" + owner.getCash());
    }

    @Override
    public String toString() {
        System.out.println(">>Farm name: " + farmName + "<<");
        System.out.println(">>Buildings: <<");
        for (int i = 0; i <= buildings.size() - 1; i++) {
            System.out.println(buildings.get(i));
        }
        System.out.println(">>Fields:  <<");
        for (int i = 0; i <= fields.size() - 1; i++) {
            System.out.println(fields.get(i));
        }
        return "#####  It is all yours ########";

    }
}
