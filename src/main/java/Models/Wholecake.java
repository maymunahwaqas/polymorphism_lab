package Models;

import java.awt.*;

public class Wholecake extends Cake {
    protected String shape;
    protected int size;
    protected int tiers;

    public Wholecake(String type, String dietaryRequirement, double cost, double sellPrice, int quantity, String ingredients, String baseFlavour, String icing, String filling, String shape, int size, int tiers) {
        super(type, dietaryRequirement, cost, sellPrice, quantity, ingredients, baseFlavour, icing, filling);
        this.shape = shape;
        this.size = size;
        this.tiers = tiers;



    }

    public boolean addCustomImage (boolean trueOrFalse){
        return trueOrFalse;
    }

}
