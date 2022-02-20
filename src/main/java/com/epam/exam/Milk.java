package com.epam.exam;

/**
 * @author Denys Matsuiev
 */
class Milk extends Ingredient{

    private final int quantity;
    private final int percent;

    public Milk() {
        super(2000);
        this.quantity = getQuantity();
        this.percent = calculatePercentageOfRemainingOfIngredient(this.quantity);
    }

    @Override
    public String toString() {
        return "Milk: " + percent + "% " + quantity + "g";
    }
}
