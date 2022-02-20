package com.epam.exam;

import java.util.List;

public interface CoffeeMakerHandler {
    void makeBeverage();
    void initCoffeeMakerWithIngredients();
    void prompt();
    void hello();
    void bye();
    boolean isACoffeeMakerRunning();
    String getUserInput();
    void printCurrentIngredients();
}
