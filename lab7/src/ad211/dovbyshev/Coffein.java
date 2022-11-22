package ad211.dovbyshev;

public abstract class Coffein {
    public void orderCoffee(Drink drink) {
        ProcessingCoffee ProcessingCoffee = createCoffee(drink);

        ProcessingCoffee.makeCoffee();
        ProcessingCoffee.giveOrderedCoffee();

        System.out.println("Order is ready\n");
    }

    protected abstract ProcessingCoffee createCoffee(Drink drink);
}
