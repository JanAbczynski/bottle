import exceptions.NoBottleException;

public class Main {

    public static void main(String[] args) throws NoBottleException {
        Distributor distributor = new Distributor();
        Bottle bottle = new Bottle();
        distributor.attachBottle(bottle);
        distributor.askForDrink();
    }


}
