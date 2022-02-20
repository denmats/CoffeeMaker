package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class Coffee extends Ingredient {

    private final int quantity;
    private final int percent;

    public Coffee() {
        super(2000);
        this.quantity = getQuantity();
        this.percent = calculatePercentageOfRemainingOfIngredient(this.quantity);
    }

    public Coffee(int quantity) {
        super(2000, quantity);
        this.quantity = setQuantity(quantity);
        this.percent = calculatePercentageOfRemainingOfIngredient(this.quantity);
    }

    @Override
    public String toString() {
        return "Coffee: " + percent + "% " + quantity + "g";
    }
}
