package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class MakeBeverageCommand implements Command{

    private final CoffeeMakerHandler coffeeMakerHandler;

    MakeBeverageCommand(CoffeeMakerHandler coffeeMakerHandler) {
        this.coffeeMakerHandler = coffeeMakerHandler;
    }

    @Override
    public void execute() {
        this.coffeeMakerHandler.makeBeverage();
    }
}
