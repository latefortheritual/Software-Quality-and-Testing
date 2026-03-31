package cts.baias.bianca.g1089.factory;

public class GPSModuleFactory implements IModuleFactory{
    @Override
    public AbstractModule createModule() {
        return new GPSModule();
    }
}
