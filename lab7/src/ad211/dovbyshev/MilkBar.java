package ad211.dovbyshev;

public class MilkBar extends Coffein {
    @Override
    protected ProcessingCoffee createCoffee(Drink drink) {
        ProcessingCoffee processingCoffee = null;
        switch (drink) {
            case AMERICANO:
                processingCoffee = new AmericanoWithMilk();
                break;
            case ESPRESSO:
                processingCoffee = new EspressoWithMilk();
                break;
            case CAPPUCCINO:
                processingCoffee = new Cappuccino();
                break;
            default:
                System.out.println("Smth went wrong");
        }
        return processingCoffee;
    }
}
