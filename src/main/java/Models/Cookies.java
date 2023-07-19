package Models;

public class Cookies extends Confectionary {

    protected boolean extraChocChip;
    public Cookies(String type, String dietaryRequirement, double cost, double sellPrice, int quantity, String ingredients, boolean extraChocChip) {
        super(type, dietaryRequirement, cost, sellPrice, quantity, ingredients);
        this.extraChocChip = false;
    }

    public boolean addTripleChoc(boolean trueOrFalse) {
        return false;
    }

}
