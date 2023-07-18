package Models;

import java.util.ArrayList;

public abstract class Cake extends Confectionary{

    protected String baseFlavour;
    protected String icing;
    protected String filling;
    public Cake(String type, String dietaryRequirement, double cost, double sellPrice, int quantity, String ingredients, String baseFlavour, String icing, String filling) {
        super(type, dietaryRequirement, cost, sellPrice, quantity, ingredients);
        this.baseFlavour = baseFlavour;
        this.icing = icing;
        this.filling = filling;
    }

    public String addMessage () {return "Happy Birthday!";}
    public String addMessage (String celebratoryMessage) {return "Congratulations!";}

    public String addMessage (String twentiethBirthday, String age) {return "She's!" + "twenny";}
}
