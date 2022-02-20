package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class StatusCommand implements Command{

    private final CoffeeMakerHandler coffeeMaker;

    public StatusCommand(CoffeeMakerHandler coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        this.coffeeMaker.printCurrentIngredients();
    }
}
