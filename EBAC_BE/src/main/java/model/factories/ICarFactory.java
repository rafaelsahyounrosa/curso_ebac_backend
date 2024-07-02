package model.factories;

import model.chaci.IChaci;
import model.roda.IRoda;

public interface ICarFactory {

    IChaci createChaci();
    IRoda createRoda();
}
