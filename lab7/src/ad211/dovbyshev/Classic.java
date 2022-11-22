package ad211.dovbyshev;

public class Classic extends Coffein {
    @Override
    protected ProcessingCoffee createCoffee(Drink drink) {
        ProcessingCoffee processingCoffee = null;
        switch (drink) {
            case AMERICANO:
                processingCoffee = new ClassicAmericano();
                break;
            case ESPRESSO:
                processingCoffee = new ClassicEspresso();
                break;
            default:
                System.out.println("Smth went wrong");
        }
        return processingCoffee;
    }
}
