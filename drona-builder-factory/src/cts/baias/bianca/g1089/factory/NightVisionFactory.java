package cts.baias.bianca.g1089.factory;

public class NightVisionFactory implements IModuleFactory{
    @Override
    public AbstractModule createModule() {
        return new NightVisionModule();
    }
}
