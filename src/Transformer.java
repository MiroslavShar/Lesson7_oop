public class Transformer implements IEnergyGenerator {

    int x;
    Gun gunLeft = new Gun(); //левая пушка
    Gun gunRight = new Gun(); //правая пушка

    public Transformer(){

    }
    public Transformer(int x) {
        this.x = x;
    }

    public Transformer(Gun gunLeft, Gun gunRight) {
        this.gunLeft = gunLeft;
        this.gunRight = gunRight;
    }


    public int run(){
        this.x += 1;

        return x;
    }

    public void fire(){
        this.gunRight.fire();
        this.gunLeft.fire();
    }

    @Override
    public void loadFuel() {

    }

    @Override
    public void generateEnergy() {

    }
    





}

