import exceptions.NoBottleException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DistributorTest {

    @Test
    void askForDrinkForNoBottle() {
        Distributor distributor = new Distributor();

        Assertions.assertThrows(NoBottleException.class, () -> distributor.askForDrink());
    }

    @Test
    void askForDrinkBottleIs() throws NoBottleException {
        Distributor distributor = new Distributor();
        Bottle bottle = new Bottle();
        distributor.attachBottle(bottle);



        Assertions.assertEquals(bottle, distributor.askForDrink());


    }
}