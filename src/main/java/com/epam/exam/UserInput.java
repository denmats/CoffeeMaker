package com.epam.exam;

import java.util.Locale;

/**
 * @author Denys Matsuiev
 */
class UserInput {
    private String userInput;

    public UserInput(String userInput) {
        this.userInput = userInput;
    }

    public void upperCaseUserInput(){
        userInput.toUpperCase(Locale.ROOT);
    }
}
