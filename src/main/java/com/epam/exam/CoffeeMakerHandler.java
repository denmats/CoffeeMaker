package com.epam.exam;

public interface CoffeeMakerHandler {

    void initCoffeeMakerWithIngredients();
    void prompt();
    void hello();
    void bye();
    boolean isACoffeeMakerRunning();
    String getUserInput();
}
