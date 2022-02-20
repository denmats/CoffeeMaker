package com.epam.exam;

import java.util.Random;

/**
 * @author Denys Matsuiev
 */
abstract class Ingredient {
    private int MAX_CAPACITY;
    private String name;
    private int quantity;
    private int percent;

    public Ingredient(String name, int MAX_CAPACITY, int quantity, int percent) {
        this.name = name;
        this.MAX_CAPACITY = MAX_CAPACITY;
        this.quantity = quantity;
        this.percent = percent;
    }



}
