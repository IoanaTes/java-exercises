package oopExercisesPartThree.allOOP;

public class Hamburger {
    private double price;
    private String name;
    private String meat;
    private String breadRollType;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    public Hamburger(double price, String name, String meat, String breadRollType){
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with," + this.meat +
                " price is " + this.price);
    }
    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        price += addition1Price;
        System.out.println("Added " + addition1Name + " for an extra "
                + addition1Price);
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        price += addition2Price;
        System.out.println("Added " + addition2Name + " for an extra "
                + addition2Price);
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        price += addition3Price;
        System.out.println("Added " + addition3Name + " for an extra "
                + addition3Price);
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        price += addition4Price;
        System.out.println("Added " + addition4Name + " for an extra "
                + addition4Price);
    }
    public double itemizeHamburger(){
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}
