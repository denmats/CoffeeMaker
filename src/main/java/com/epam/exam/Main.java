package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class Main {


    public static void main(String[] args) {

        CoffeeMakerHandler newCoffeeMaker = new CoffeeMaker();

        while (newCoffeeMaker.isACoffeeMakerRunning()) {
            newCoffeeMaker.prompt();
            performTheCommandFromInput(newCoffeeMaker);
        }

    }

    private static void performTheCommandFromInput(CoffeeMakerHandler newCoffeeMaker) {
        switch (newCoffeeMaker.getUserInput()){
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
            default -> {
                System.out.println("Unknown Command!");;
            }
        }
    }
}
