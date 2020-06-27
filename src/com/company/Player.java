package com.company;

public class Player {
    Integer id;
    String name;
    Double cash;
    Farm farm;

    public Player(Integer id, String name, Double cash) {
        this.id = id;
        this.name = name;
        this.cash = cash;
    }

    public Player(Integer id) {
        this.id = id;
    }
}
