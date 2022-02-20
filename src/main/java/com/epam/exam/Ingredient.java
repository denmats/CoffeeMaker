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

    public Ingredient(int max_capacity) {
        this.name = getClass().getName();
        this.MAX_CAPACITY = max_capacity;
        this.MIN_CAPACITY = 0;
        this.quantity = setQuantityViaGeneratingRandomValue();
        this.percent = calculatePercentageOfRemainingOfIngredient(this.quantity);
    }

    public Ingredient(int max_capacity,int quantity) {
        this.name = getClass().getName();
        this.MAX_CAPACITY = max_capacity;
        this.MIN_CAPACITY = 0;
        this.quantity = setQuantity(quantity);
        this.percent = calculatePercentageOfRemainingOfIngredient(this.quantity);
    }

    public int setQuantityViaGeneratingRandomValue(){
        int randomQuantity = generateARandomValueForInitializingIngredientStartingQuantity();
        while(isInTheRange(randomQuantity)){
            randomQuantity = generateARandomValueForInitializingIngredientStartingQuantity();
        }
        return randomQuantity;
    }

    private boolean isInTheRange(int randomQuantity) {
        return randomQuantity >= MIN_CAPACITY && randomQuantity <= MIN_CAPACITY;
    }

    private int generateARandomValueForInitializingIngredientStartingQuantity(){
        Random random = new Random();
        return random.nextInt(MAX_CAPACITY - MIN_CAPACITY)+ MIN_CAPACITY;
    }

    public int setQuantity(int quantity){
        return isInTheRange(quantity) ? quantity : 0;
    }

    public int getQuantity(){
        return quantity;
    }

    public int calculatePercentageOfRemainingOfIngredient(int quantity){
        return (int) ((double) quantity/MAX_CAPACITY * 100);
    }

    public String getName(){
        return name;
    }
}
