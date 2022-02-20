package com.epam.exam;

import java.util.Random;

/**
 * @author Denys Matsuiev
 */
abstract class Ingredient {
    private final int MAX_CAPACITY;
    private final int MIN_CAPACITY;
    private final String name;
    private int quantity;
    private int percent;

    public Ingredient() {
        this.name = getClass().getName();
        this.MAX_CAPACITY = 2000;
        this.MIN_CAPACITY = 0;
        this.quantity = generateARandomValueForInitializingIngredientStartingQuantity();
        this.percent = calculatePercentageOfRemainingOfIngredient(this.quantity);
    }

    public Ingredient(int quantity) {
        this.name = getClass().getName();
        this.MAX_CAPACITY = 2000;
        this.MIN_CAPACITY = 0;
        this.quantity = quantity;
        this.percent = calculatePercentageOfRemainingOfIngredient(this.quantity);
    }

    public int setQuantityViaGeneratingRandomValue(){
        int randomQuantity = generateARandomValueForInitializingIngredientStartingQuantity();
        while(!(randomQuantity >= MIN_CAPACITY && randomQuantity <= MIN_CAPACITY)){
            randomQuantity = generateARandomValueForInitializingIngredientStartingQuantity();
        }
        return randomQuantity;
    }

    private int generateARandomValueForInitializingIngredientStartingQuantity(){
        Random random = new Random();
        return random.nextInt(MAX_CAPACITY - MIN_CAPACITY)+ MIN_CAPACITY;
    }

    public int setQuantity(int quantity){
        return quantity > 0 ? this.quantity = quantity : 0;
    }

    public int getQuantity(){
        return quantity;
    }

    public int calculatePercentageOfRemainingOfIngredient(int quantity){
        return (int) ((double) quantity/MAX_CAPACITY * 100);
    }

}
