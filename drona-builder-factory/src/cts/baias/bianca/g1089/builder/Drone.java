package cts.baias.bianca.g1089.builder;

public class Drone {
    //campuri obligatorii
    private String model;
    private String softwareVersion;
    //campuri optionale
    private float maxSpeed;
    private AbstractModule extraBattery;
    private float greutate;
    private int nrCamere;
    private int autonomieBaterie;

    private Drone(String model, String softwareVersion, float maxSpeed, AbstractModule extraBattery, float greutate, int nrCamere, int autonomieBaterie) {
        this.model = model;
        this.softwareVersion = softwareVersion;
        this.maxSpeed = maxSpeed;
        this.extraBattery = extraBattery;
        this.greutate = greutate;
        this.nrCamere = nrCamere;
        this.autonomieBaterie = autonomieBaterie;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "model='" + model + '\'' +
                ", softwareVersion='" + softwareVersion + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", extraBattery=" + extraBattery +
                ", greutate=" + greutate +
                ", nrCamere=" + nrCamere +
                ", autonomieBaterie=" + autonomieBaterie +
                '}';
    }

    public static IBuilder getBuilder(String model, String softwareVersion){
        return new DroneBuilder(model, softwareVersion);
    }

    private static class DroneBuilder implements IBuilder{
        //campuri obligatorii
        private String model;
        private String softwareVersion;
        //campuri optionale
        private float maxSpeed;
        private AbstractModule extraBattery;
        private float greutate;
        private int nrCamere;
        private int autonomieBaterie;

        //zona obligatorie
        private DroneBuilder(String model, String softwareVersion) {
            this.model = model;
            this.softwareVersion = softwareVersion;
        }

        //zona optionala-> setteri


        @Override
        public DroneBuilder setMaxSpeed(float maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        @Override
        public DroneBuilder setExtraBattery(AbstractModule extraBattery) {
            this.extraBattery = extraBattery;
            return this;
        }

        @Override
        public DroneBuilder setGreutate(float greutate) {
            this.greutate = greutate;
            return this;
        }

        @Override
        public DroneBuilder setNrCamere(int nrCamere) {
            this.nrCamere = nrCamere;
            return this;
        }

        @Override
        public DroneBuilder setAutonomieBaterie(int autonomieBaterie) {
            this.autonomieBaterie = autonomieBaterie;
            return this;
        }

        @Override
        public Drone build() {
            if(model == null || softwareVersion == null){
                throw new RuntimeException("Modelul și versiunea software sunt obligatorii");
            }
           Drone droneRezultat =  new Drone(model,  softwareVersion,  maxSpeed,  extraBattery,  greutate,  nrCamere,  autonomieBaterie);

            maxSpeed = 0;
           extraBattery = null;
           greutate = 0;
           nrCamere = 0;
           autonomieBaterie = 0;

           return droneRezultat;

        }
    }
}
