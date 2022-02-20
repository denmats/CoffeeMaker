package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class Coffee extends Ingredient {

    private final int quantity;
    private int percent;

    public Coffee() {
        super();
        this.quantity = getQuantity();
        this.percent = calculatePercentageOfRemainingOfIngredient(this.quantity);
    }

    @Override
    public String toString() {
        return "Coffee: " + percent + "% " + quantity + "g";
    }
}
