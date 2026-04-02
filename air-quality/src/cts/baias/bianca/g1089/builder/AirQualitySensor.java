package cts.baias.bianca.g1089.builder;

import cts.baias.bianca.g1089.factory.AbstractAirQualityReport;

import java.sql.SQLOutput;

public class AirQualitySensor implements AbstractAirQualitySensor{
    //campuri ootionale
    private  boolean hasPM25;
    private  boolean hasPM10;
    private  boolean hasVOC;
    private  boolean hasCO2;
    private  boolean hasCO;
    private  boolean hasTemperature;
    private  boolean hasHumidity;



    private AirQualitySensor(boolean hasPM25, boolean hasPM10, boolean hasVOC, boolean hasCO2, boolean hasCO, boolean hasTemperature, boolean hasHumidity) {
        this.hasPM25 = hasPM25;
        this.hasPM10 = hasPM10;
        this.hasVOC = hasVOC;
        this.hasCO2 = hasCO2;
        this.hasCO = hasCO;
        this.hasTemperature = hasTemperature;
        this.hasHumidity = hasHumidity;
    }

    @Override
    public String toString() {
        return "AirQualitySensor{" +
                "hasPM25=" + hasPM25 +
                ", hasPM10=" + hasPM10 +
                ", hasVOC=" + hasVOC +
                ", hasCO2=" + hasCO2 +
                ", hasCO=" + hasCO +
                ", hasTemperature=" + hasTemperature +
                ", hasHumidity=" + hasHumidity +
                '}';
    }

    @Override
    public void displayCapabilities() {
        System.out.println(this);
    }

    public static IBuilder getBuilder(){
        return new SensorBuilder();
    }

    private static class SensorBuilder implements IBuilder {
        //campuri ootionale
        private  boolean hasPM25;
        private  boolean hasPM10;
        private  boolean hasVOC;
        private  boolean hasCO2;
        private  boolean hasCO;
        private  boolean hasTemperature;
        private  boolean hasHumidity;

        private SensorBuilder(){}

        @Override
        public IBuilder setHasPM25(boolean hasPM25) {
            this.hasPM25 = hasPM25;
            return this;
        }

        @Override
        public IBuilder setHasPM10(boolean hasPM10) {
            this.hasPM10 = hasPM10;
            return this;
        }

        @Override
        public IBuilder setHasVOC(boolean hasVOC) {
            this.hasVOC = hasVOC;
            return this;
        }

        @Override
        public IBuilder setHasCO2(boolean hasCO2) {
            this.hasCO2 = hasCO2;
            return this;
        }

        @Override
        public IBuilder setHasCO(boolean hasCO) {
            this.hasCO = hasCO;
            return this;
        }

        @Override
        public IBuilder setHasTemperature(boolean hasTemperature) {
            this.hasTemperature = hasTemperature;
            return this;
        }

        @Override
        public IBuilder setHasHumidity(boolean hasHumidity) {
            this.hasHumidity = hasHumidity;
            return this;
        }

        @Override
        public AirQualitySensor build() {
        AirQualitySensor airQualitySensorRezultat = new AirQualitySensor(hasPM25,  hasPM10, hasVOC, hasCO2,  hasCO,  hasTemperature,  hasHumidity);

        this.hasPM25 = false;
        this.hasPM10 = false;
        this.hasVOC= false;
        this.hasCO2=false;
        this.hasCO= false;
        this.hasTemperature= false;
        this.hasHumidity=false;

            return airQualitySensorRezultat;
        }
    }
}
