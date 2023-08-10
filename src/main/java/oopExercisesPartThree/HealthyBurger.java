package oopExercisesPartThree;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    public HealthyBurger(String meat, double price) {
        super(price, "Healthy Burger", meat, "Brown");
    }
    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        System.out.println(healthyExtra1Name + "for the extra"
                + healthyExtra1Price );
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        System.out.println(healthyExtra2Name + " for the extra "
                + healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        return healthyExtra1Price + healthyExtra2Price + super.itemizeHamburger();
    }
}