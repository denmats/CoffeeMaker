package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class Water extends Ingredient{

    private final int quantity;
    private int percent;

    public Water() {
        super();
        this.quantity = getQuantity();
        this.percent = calculatePercentageOfRemainingOfIngredient(this.quantity);
    }

    @Override
    public String toString() {
        return "Water: " + percent + "% " + quantity + "g";
    }
}
