package com.company;

import com.company.Buildings.Buildings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("#####   Hello in my farm game   #####");
        System.out.println("#####   Do you want to be real farmer?   #####");
        System.out.println("#####   Y/N   #####");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println(text);
        if (text.equals("y")) {
            Player player1 = new Player(1);
            Farm farm1 = new Farm();
            player1.farm = farm1;
            System.out.println("#####   LETS DO IT!!   #####");
            System.out.println("#####   Please write your name:   #####");
            player1.name = scan.nextLine();
            System.out.println("#####   Its time to generate your farm   #####");
            System.out.println("##### " + player1.name + " please write your farm name:   #####");
            player1.farm.farmName = scan.nextLine();
            System.out.println("#####  " + player1.name + " your farm " + player1.farm.farmName + " is ready to go   #####");
            Buildings randomBuilding1 = new Buildings();
            Buildings randomBuilding2 = new Buildings(randomBuilding1.buildingGenarator());
            player1.farm.buildings.add(randomBuilding2);
            System.out.println(player1.farm.buildings.toString());


        } else {
            System.out.println("#####   Come back when you ready   #####");
        }

        //for int
//        int num= scan.nextInt();
//        System.out.println(num);
//        System.out.println("#####      #####");
//        System.out.println("#####      #####");
//        System.out.println("#####      #####");
//        System.out.println("#####      #####");
//        System.out.println("#####      #####");
//    }
    }
}
