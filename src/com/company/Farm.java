package com.company;

import com.company.Animals.Animals;
import com.company.Animals.FarmAnimals.FarmAnimals;
import com.company.Animals.Pets.Pets;
import com.company.Buildings.Buildings;
import com.company.Fields.Fields;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Farm implements SaleAble {
    String farmName;
    public List<Buildings> buildings = new ArrayList<Buildings>();
    public List<Fields> fields = new ArrayList<Fields>();

    public void generateFarm() {
        this.buildingsGenerator();
        this.fieldsGenerator();
        fields.add(fieldsGenerator());
        buildings.add(buildingsGenerator());


    }

    public Buildings buildingsGenerator() {
        Buildings temporaryBuilding = new Buildings();//generate new build
        Buildings temporaryBuilding2 = new Buildings(temporaryBuilding.buildingGenarator());//create random new build with name and capacity
        return temporaryBuilding2;
    }

    public Fields fieldsGenerator() {
        Fields temporaryField = new Fields();
        return temporaryField;
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

    @Override
    public void sell(Player seller) {

    }

    public void menu1Show() {
        System.out.println("Choose what you want to do");
        System.out.println("1.Buy Buildings");
        System.out.println("2. Buy Fields");
        System.out.println("3. Show my farm");
        System.out.println("0. Exit");

    }

    @Override
    public void buy(Player owner) {
        System.out.println("1.Shopping");
        System.out.println("0.Exit");
        Scanner sc = new Scanner(System.in);
        while ((sc.nextInt()) == 0) ;
        {
            Scanner scan = new Scanner(System.in);
            menu1Show();
            ;
            int menu1;
            while (((menu1 = scan.nextInt())) != 0) {
                switch (menu1) {
                    case 1: {
                        System.out.println("Choose what building you want buy");
                        System.out.println("1.Dog House");
                        System.out.println("2.ChickenBarn");
                        System.out.println("3.Cow Barn");
                        System.out.println("4.PigBarn");
                        System.out.println("5.DuckBarn");
                        System.out.println("6.Rabbit House");
                        System.out.println("Type number");
                        switch (scan.nextInt()) {
                            case 1:
                                Buildings tempBuild1 = new Buildings("Dog House");
                                if (owner.getCash() > tempBuild1.buildingsValue) {
                                    buildings.add(tempBuild1);
                                    owner.setCash(owner.getCash() - tempBuild1.buildingsValue);
                                } else {
                                    System.out.println("Not enough money");
                                }
                                break;
                            case 2:
                                Buildings tempBuild2 = new Buildings("Chicken Barn");
                                if (owner.getCash() > tempBuild2.buildingsValue) {
                                    buildings.add(tempBuild2);
                                    owner.setCash(owner.getCash() - tempBuild2.buildingsValue);
                                } else {
                                    System.out.println("Not enough money");
                                }
                                break;
                            case 3:
                                Buildings tempBuild3 = new Buildings("Cow Barn");
                                if (owner.getCash() > tempBuild3.buildingsValue) {
                                    buildings.add(tempBuild3);
                                    owner.setCash(owner.getCash() - tempBuild3.buildingsValue);
                                } else {
                                    System.out.println("Not enough money");
                                }
                                break;
                            case 4:
                                Buildings tempBuild4 = new Buildings("Pig Barn");
                                if (owner.getCash() > tempBuild4.buildingsValue) {
                                    buildings.add(tempBuild4);
                                    owner.setCash(owner.getCash() - tempBuild4.buildingsValue);
                                } else {
                                    System.out.println("Not enough money");
                                }
                                break;
                            case 5:
                                Buildings tempBuild5 = new Buildings("Duck Barn");
                                if (owner.getCash() > tempBuild5.buildingsValue) {
                                    buildings.add(tempBuild5);
                                    owner.setCash(owner.getCash() - tempBuild5.buildingsValue);
                                } else {
                                    System.out.println("Not enough money");
                                }
                                break;
                            case 6:
                                Buildings tempBuild6 = new Buildings("Rabbit House");
                                if (owner.getCash() > tempBuild6.buildingsValue) {
                                    buildings.add(tempBuild6);
                                    owner.setCash(owner.getCash() - tempBuild6.buildingsValue);
                                } else {
                                    System.out.println("Not enough money");
                                }
                                break;
                            default:
                                System.out.println("exit");
                                break;
                        }
                        System.out.println("Your money now is:" + owner.getCash());
                        menu1Show();
                    }
                    continue;


                    case 2: {
                        Fields temp1 = new Fields();
                        temp1 = fieldsGenerator();
                        Fields temp2 = new Fields();
                        temp2 = fieldsGenerator();
                        Fields temp3 = new Fields();
                        temp3 = fieldsGenerator();
                        Fields temp4 = new Fields();
                        temp4 = fieldsGenerator();
                        System.out.println("1.Lets buy some fileds");
                        System.out.println("0.Exit");
                        while ((sc.nextInt()) != 0) {
                            System.out.println("There are possible fields to buy");
                            System.out.println("Which one you choose?");
                            System.out.print("1: " + temp1);
                            System.out.print("2: " + temp2);
                            System.out.print("3: " + temp3);
                            System.out.print("4: " + temp4);
                            System.out.println("0: Exit");
                            switch (scan.nextInt()) {
                                case 1:
                                    if (owner.getCash() > temp1.getFieldValue()) {
                                        fields.add(temp1);
                                        owner.setCash(owner.getCash() - temp1.getFieldValue());
                                    } else {
                                        System.out.println("Not enough money");
                                    }
                                    break;
                                case 2:
                                    if (owner.getCash() > temp2.getFieldValue()) {
                                        fields.add(temp2);
                                        owner.setCash(owner.getCash() - temp2.getFieldValue());
                                    } else {
                                        System.out.println("Not enough money");
                                    }
                                    break;
                                case 3:
                                    if (owner.getCash() > temp3.getFieldValue()) {
                                        fields.add(temp3);
                                        owner.setCash(owner.getCash() - temp3.getFieldValue());
                                    } else {
                                        System.out.println("Not enough money");
                                    }
                                    break;
                                case 4:
                                    if (owner.getCash() > temp4.getFieldValue()) {
                                        fields.add(temp4);
                                        owner.setCash(owner.getCash() - temp4.getFieldValue());
                                    } else {
                                        System.out.println("Not enough money");
                                    }
                                    break;
                                case 0:
                                    break;
                                default:
                                    break;

                            } System.out.println("1.Buy new field");
                            System.out.println("0.Exit");
                            continue;
                        }menu1Show();
                        break;
                    }
                    case 3: {
                        System.out.println(buildings);
                        System.out.println(fields);
                        menu1Show();
                    }
                }

            }
        }
    }
}
