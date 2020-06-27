package com.company.Animals;

import com.company.Crops.Crops;

public class Animals {
    Double buyPrice; //zł for one
    Double sellPrice;//zł for one kg
    Double weight; // kg
    Integer age; //age in weeks
    Integer adultAge; //age when animal cant get weight and can make a baby
    Double foodPerWeek; // required food per week
    Crops foodRequired; // type of food for animal
    Double getBabyChance; // chance for getting new animal from two another this same species
}
