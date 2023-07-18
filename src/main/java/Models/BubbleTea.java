package Models;

import Interface.ISell;

import java.util.ArrayList;

public class BubbleTea implements ISell {
    protected String flavour;
    protected String syrup;
    protected boolean tapioca;
    protected boolean iced;
    protected int sugarPercentage;
    protected double cost;
    protected double sellPrice;

    public BubbleTea (String flavour, String syrup, boolean tapioca, boolean iced, int sugarPercentage, double cost, double sellPrice){
        this.flavour = flavour;
        this.syrup = syrup;
        this.tapioca = tapioca;
        this.iced = iced;
        this.sugarPercentage = sugarPercentage;
        this.cost = cost;
        this.sellPrice = sellPrice;
    }

    public double calculateMargin (){ return this.sellPrice - this.cost; }
}
