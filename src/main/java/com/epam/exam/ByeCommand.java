package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class ByeCommand implements Command{

    CoffeeMakerHandler coffeeMaker;

    public ByeCommand(CoffeeMakerHandler coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }
    @Override
    public void execute() {
        this.coffeeMaker.bye();
    }
}
