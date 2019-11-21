import drink.Cold;
import exceptions.NoBottleException;

public class Distributor{

    final static int NECCESSARY_CAPACITY = 3;
    boolean bottleIsConnected;
    Bottle bottle;


    Distributor(){

    }

    public void attachBottle(Bottle bottle){
        this.bottle = bottle;
    }



    public Bottle askForDrink() throws NoBottleException{
        if(!checkIsBottle()){
            throw new NoBottleException("no bottle");
        }
        if(checkIsBottle() && checkCapacity()){
            giveDrink();
        }
        return bottle;
    }




    private boolean checkIsBottle(){

        return bottle != null;
    }

    private boolean checkCapacity(){
        return bottle.getCapacity() >= NECCESSARY_CAPACITY;
    }

    private void giveDrink(){
        bottle.setContent(new Cold());
    }





}
