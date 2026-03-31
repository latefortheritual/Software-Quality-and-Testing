package cts.baias.bianca.g1089.factory;

public class HighResCameraFactory implements IModuleFactory{
    @Override
    public AbstractModule createModule() {
        return new HighResCameraModule();
    }
}
