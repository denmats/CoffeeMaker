package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class Water extends Ingredient{

    private final int quantity;
    private final int percent;

    public Water() {
        super(1500);
        this.quantity = getQuantity();
        this.percent = calculatePercentageOfRemainingOfIngredient(this.quantity);
    }

    @Override
    public String toString() {
        return "Water: " + percent + "% " + quantity + "g";
    }
}
