package ad211.dovbyshev;

public class Main {
    public static void main(String[] args) {
        Coffein coffeeBar = new MilkBar();
        coffeeBar.orderCoffee(Drink.AMERICANO);
        coffeeBar.orderCoffee(Drink.CAPPUCCINO);
        coffeeBar = new Classic();
        coffeeBar.orderCoffee(Drink.AMERICANO);
        coffeeBar.orderCoffee(Drink.ESPRESSO);
    }
}