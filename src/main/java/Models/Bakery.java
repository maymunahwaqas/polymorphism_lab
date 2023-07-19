package Models;

import Interface.ISell;

import java.util.ArrayList;

public class Bakery {

    protected String name;
    protected double till;
    protected ArrayList<ISell> bakeryStock;

    public Bakery (String name, double till, ArrayList<ISell> bakeryStock){
        this.name = name;
        this.till = till;
        this.bakeryStock = bakeryStock;

        }

    public ArrayList<Confectionary> confectionarys;

//    protected Bakery() { this.confectionarys + this.bubbleTeas = new ArrayList<>();}
//
//    public int countConfectionarys() {
//        return this.confectionarys + this.bubbleTeas.size(); }

    public void addConfectionarys(Confectionary confectionary) { this.confectionarys.add(confectionary); }


    public ArrayList<BubbleTea> bubbleTeas;
    public Bakery() { this.bubbleTeas = new ArrayList<>();}


    public void calculateProfit(){


    }

    public ArrayList<Confectionary> countConfectionarys() {
        return this.confectionarys;
    }
}
