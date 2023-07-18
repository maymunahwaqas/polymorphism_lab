package Models;

import Interface.ISell;

public abstract class Confectionary implements ISell {

    protected String type;
    protected String dietaryRequirement;
    protected double cost;
    protected double sellPrice;
    protected int quantity;
    protected String ingredients;


    public Confectionary (String type){
        this.type = type;
        this.dietaryRequirement = dietaryRequirement;
        this.cost = 0.00;
        this.sellPrice = 0.00;
        this.quantity = 0;
        this.ingredients =  ingredients;

    }

    public double calculateMargin (){ return this.sellPrice - this.cost; }









}
