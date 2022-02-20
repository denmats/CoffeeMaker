package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class Cocoa extends Ingredient{
    private final int quantity;
    private final int percent;

    public Cocoa() {
        super(1700);
        this.quantity = getQuantity();
        this.percent = calculatePercentageOfRemainingOfIngredient(this.quantity);
    }

    @Override
    public String toString() {
        return "Cocoa: " + percent + "% " + quantity + "g";
    }
}
