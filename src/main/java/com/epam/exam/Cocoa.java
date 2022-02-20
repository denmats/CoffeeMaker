package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class Cocoa extends Ingredient{
    private final int quantity;
    private int percent;

    public Cocoa() {
        super();
        this.quantity = getQuantity();
        this.percent = calculatePercentageOfRemainingOfIngredient(this.quantity);
    }

    @Override
    public String toString() {
        return "Cocoa: " + percent + "% " + quantity + "g";
    }
}
