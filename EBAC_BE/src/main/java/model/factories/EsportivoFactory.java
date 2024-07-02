package model.factories;

import model.chaci.ChaciEsportivo;
import model.chaci.IChaci;
import model.roda.IRoda;
import model.roda.RodaEsportivo;

public class EsportivoFactory implements ICarFactory{
    @Override
    public IChaci createChaci() {
        return new ChaciEsportivo();
    }

    @Override
    public IRoda createRoda() {
        return new RodaEsportivo();
    }
}
