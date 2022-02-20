package com.epam.exam;

/**
 *
 * Invoker
 *
 * @author Denys Matsuiev
 */
class UserInterface {

    Command theCommand;

    public UserInterface(Command newCommand) {
        this.theCommand = newCommand;
    }

    public void invoke(){
        theCommand.execute();
    }
}
