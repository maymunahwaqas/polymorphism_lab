package Models;

import Interface.ISell;

public abstract class Confectionary implements ISell {

    protected String type;
    protected String dietaryRequirement;
    protected double cost;
    protected double sellPrice;
    protected int quantity;
    protected String ingredients;


    public Confectionary (String type, String dietaryRequirement, double cost, double sellPrice, int quantity, String ingredients){
        this.type = type;
        this.dietaryRequirement = this.dietaryRequirement;
        this.cost = 0.00;
        this.sellPrice = 0.00;
        this.quantity = 0;
        this.ingredients = this.ingredients;

    }

    public double calculateMargin (){ return this.sellPrice - this.cost; }









}
