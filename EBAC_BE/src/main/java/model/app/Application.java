package model.app;

import model.chaci.IChaci;
import model.factories.ICarFactory;
import model.roda.IRoda;

public class Application {

    private IChaci chaci;
    private IRoda roda;

    public Application(ICarFactory carFactory) {

        chaci = carFactory.createChaci();
        roda = carFactory.createRoda();
    }

    public void preparaCar(){
        chaci.defineQuantidadeLugares();
        roda.defineRodas();
    }
}
