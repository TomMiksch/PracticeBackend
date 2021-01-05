package com.sarahshusband.practicebackend.objects;

import lombok.Getter;

@Getter
public enum MassType {
    COUNT("ct"),
    WEIGHT("g", "oz", "lbs"),
    VOLUME("ml", "l", "tsp", "tbsp", "oz", "pints", "cups", "qrts", "gallons");

    MassType(String... massType) { }
}
