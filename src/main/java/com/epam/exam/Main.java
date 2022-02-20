package com.epam.exam;

import java.util.List;

/**
 * @author Denys Matsuiev
 */
class Main {

    public static void main(String[] args) {

        CoffeeMakerHandler newCoffeeMaker = new CoffeeMaker();
        IngredientInitializerCommand ingredientInitializerCommand = new IngredientInitializerCommand(newCoffeeMaker);
        UserInterface initUI = new UserInterface(ingredientInitializerCommand);
        initUI.invoke();

        while (newCoffeeMaker.isACoffeeMakerRunning()) {
            PromptCommand promptCommand = new PromptCommand(newCoffeeMaker);
            UserInterface promptUI = new UserInterface(promptCommand);
            promptUI.invoke();
            performTheCommandFromInput(newCoffeeMaker);
        }
    }

    private static void performTheCommandFromInput(CoffeeMakerHandler newCoffeeMaker) {
        switch (newCoffeeMaker.getUserInput()){
//        switch ("MAKE"){
            case "HELLO" -> {
                HelloCommand helloCommand = new HelloCommand(newCoffeeMaker);
                UserInterface helloUI = new UserInterface(helloCommand);
                helloUI.invoke();
            }
            case "BYE" ->{
                ByeCommand byeCommand = new ByeCommand(newCoffeeMaker);
                UserInterface byeUI = new UserInterface(byeCommand);
                byeUI.invoke();
            }
            case "STATUS" ->{
                StatusCommand statusCommand = new StatusCommand(newCoffeeMaker);
                UserInterface statusUI = new UserInterface(statusCommand);
                statusUI.invoke();
            }
            case "MAKE" ->{
                MakeBeverageCommand makeBeverageCommand = new MakeBeverageCommand(newCoffeeMaker);
                UserInterface makeUI = new UserInterface(makeBeverageCommand);
                makeUI.invoke();
            }
            default -> {
                System.out.println("Unknown Command!");
            }
        }
    }
}
