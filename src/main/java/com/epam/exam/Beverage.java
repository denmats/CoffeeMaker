package com.epam.exam;

import java.util.List;
import java.util.Objects;

/**
 * @author Denys Matsuiev
 */
class Beverage {

    List<Ingredient> ingredients;
    int coffeeConsumedQuantity;
    int waterConsumedQuantity;
    int milkConsumedQuantity;
    int cocoaConsumedQuantity;

    public Beverage(List<Ingredient> ingredients, int coffeeConsumedQuantity,
                    int waterConsumedQuantity, int milkConsumedQuantity, int cocoaConsumedQuantity) {
        this.ingredients = ingredients;
        this.coffeeConsumedQuantity = coffeeConsumedQuantity;
        this.waterConsumedQuantity = waterConsumedQuantity;
        this.milkConsumedQuantity = milkConsumedQuantity;
        this.cocoaConsumedQuantity = cocoaConsumedQuantity;
    }

    //FIXME set up 0 as a new quantity of coffee
    public void makeBeverage(){
        Coffee aNewCoffee = grindCoffee();
//        heatWater();
//        pourWater();
//        pourWater();
        Coffee oldCoffee = (Coffee) findAnIngredientByNameFromTheList(ingredients, Coffee.class.getName());
        ingredients.remove(oldCoffee);
        ingredients.add(aNewCoffee);
    }

    private Coffee grindCoffee() {
        Coffee coffee = (Coffee) findAnIngredientByNameFromTheList(ingredients, Coffee.class.getName());
        assert coffee != null;
        int oldQuantityOfCoffee = coffee.getQuantity();
        int aNewQuantityOfCoffee = oldQuantityOfCoffee - coffeeConsumedQuantity;
        coffee.setQuantity(aNewQuantityOfCoffee);
        return new Coffee(aNewQuantityOfCoffee);
    }


    private Ingredient findAnIngredientByNameFromTheList(List<Ingredient> ingredients, String ingredientName){
        Objects.requireNonNull(ingredients);
        for ( Ingredient i : ingredients ) {
            if(i.getName().equalsIgnoreCase(ingredientName)){
                return i;
            }
        }
       return null;
    }
}
