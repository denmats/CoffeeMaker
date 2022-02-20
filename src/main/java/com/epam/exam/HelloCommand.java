package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class HelloCommand implements Command{

    CoffeeMakerHandler coffeeMaker;

    public HelloCommand(CoffeeMakerHandler coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        this.coffeeMaker.hello();
    }
}
