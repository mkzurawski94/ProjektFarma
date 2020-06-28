package com.company;

import com.company.Buildings.Buildings;

import java.util.Random;

public class Player {
    Integer id;
    String name;
   private Double cash;
    Farm farm;
public final double DEFAULT_PLAYER_CASH=100000.0;
    public Player(Integer id) {
        this.id = id;
        this.cash=DEFAULT_PLAYER_CASH;

    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Double getCash() {
        return cash;
    }




}
