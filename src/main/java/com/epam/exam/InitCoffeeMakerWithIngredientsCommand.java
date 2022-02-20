package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class InitCoffeeMakerWithIngredientsCommand implements Command{

    private final CoffeeMaker coffeeMaker;

    public InitCoffeeMakerWithIngredientsCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        this.coffeeMaker.initCoffeeMakerWithIngredients();
    }
}
