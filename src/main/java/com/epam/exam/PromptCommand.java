package com.epam.exam;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Denys Matsuiev
 */
class PromptCommand implements Command{

    CoffeeMakerHandler coffeeMaker;

    public PromptCommand(CoffeeMakerHandler coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        this.coffeeMaker.prompt();
    }
}
