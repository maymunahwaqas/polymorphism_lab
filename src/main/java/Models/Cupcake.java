package Models;

public class Cupcake extends Cake {


    protected boolean cherryOnTop;

    public Cupcake(String type, String dietaryRequirement, double cost, double sellPrice, int quantity, String ingredients, String baseFlavour, String icing, String filling, boolean cherryOnTop) {
        super(type, dietaryRequirement, cost, sellPrice, quantity, ingredients, baseFlavour, icing, filling);
    this.cherryOnTop = false;

    }




}

