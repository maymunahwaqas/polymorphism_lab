package Models;

import Interface.ISell;

import java.util.ArrayList;

public class Bakery {

    protected String name;
    protected double till;
    protected ArrayList<ISell> bakeryStock;

    public Bakery (String name, double till, ArrayList<ISell bakeryStock>){
        this.name = name;
        this.till = till;
        this.bakeryStock = bakeryStock;

        }

    protected ArrayList<Confectionary> confectionarys;

//    protected Bakery() { this.confectionarys + this.bubbleTeas = new ArrayList<>();}
//
//    public int countConfectionarys() {
//        return this.confectionarys + this.bubbleTeas.size(); }

    public void addConfectionarys(Confectionary confectionary) { this.confectionarys.add(confectionary); }


    protected ArrayList<BubbleTea> bubbleTeas;
    protected Bakery() { this.bubbleTeas = new ArrayList<>();}


    public void calculateProfit(){


    }
}
