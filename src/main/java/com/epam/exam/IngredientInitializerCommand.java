package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class IngredientInitializerCommand implements Command{

    CoffeeMakerHandler coffeeMaker;

    public IngredientInitializerCommand(CoffeeMakerHandler coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.initCoffeeMakerWithIngredients();
    }
}
