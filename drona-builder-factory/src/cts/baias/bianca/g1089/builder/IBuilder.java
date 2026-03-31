package cts.baias.bianca.g1089.builder;

public interface IBuilder {
    Drone build();
    IBuilder  setMaxSpeed(float maxSpeed);
    IBuilder  setExtraBattery (AbstractModule extraBattery);
    IBuilder  setGreutate(float greutate);
    IBuilder  setNrCamere (int nrCamere);
    IBuilder  setAutonomieBaterie (int autonomieBaterie);
}
