package com.epam.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Receiver
 *
 * @author Denys Matsuiev
 */
class CoffeeMaker implements CoffeeMakerHandler {

    private static final Scanner in = new Scanner(System.in);

    private String userInput;
    private String coffeeMakerOutput;
    private boolean isACoffeeMakerRunning;
    private List<Ingredient> ingredients;

    public CoffeeMaker() {
        this.userInput = "";
        this.coffeeMakerOutput = "";
        this.isACoffeeMakerRunning = true;
        this.ingredients = new ArrayList<>();
    }

    @Override
    public String getUserInput() {
        return userInput;
    }

   @Override
    public void printCurrentIngredients() {
        for ( Ingredient i : ingredients ) {
            System.out.println(i);
        }
    }

    @Override
    public void initCoffeeMakerWithIngredients() {
        ingredients.add(new Coffee());
        ingredients.add(new Water());
        ingredients.add(new Milk());
        ingredients.add(new Cocoa());
    }

    @Override
    public void prompt() {
        System.out.print("CoffeeMaker> ");
        this.userInput = readUserInput();
    }

    private String readUserInput() {
        if (in.hasNext()) {
            return in.nextLine().toUpperCase(Locale.ROOT);
        }
        return "";
    }

    @Override
    public void hello() {
        this.coffeeMakerOutput = "Hello!";
        printAMessage(this.coffeeMakerOutput);
    }

    @Override
    public void bye() {
        this.isACoffeeMakerRunning = false;
        this.coffeeMakerOutput = "Bye!";
        printAMessage(this.coffeeMakerOutput);
    }

    @Override
    public boolean isACoffeeMakerRunning() {
        return this.isACoffeeMakerRunning;
    }

    private void printAMessage(String message) {
        System.out.println(message);
    }
}
