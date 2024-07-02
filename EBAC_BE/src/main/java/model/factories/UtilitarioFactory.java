package model.factories;

import model.chaci.ChaciUtilitario;
import model.chaci.IChaci;
import model.roda.IRoda;
import model.roda.RodaUtilitario;

public class UtilitarioFactory implements ICarFactory{
    @Override
    public IChaci createChaci() {
        return new ChaciUtilitario();
    }

    @Override
    public IRoda createRoda() {
        return new RodaUtilitario();
    }
}
