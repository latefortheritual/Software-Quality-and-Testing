package cts.baias.bianca.g1089.builder;

public interface IBuilder {
    AirQualitySensor build();

    IBuilder setHasPM25(boolean hasPM25);

    IBuilder setHasPM10(boolean hasPM10);

    IBuilder setHasVOC(boolean hasVOC);

    IBuilder setHasCO2(boolean hasCO2);

    IBuilder setHasCO(boolean hasCO);

    IBuilder setHasTemperature(boolean hasTemperature);

    IBuilder setHasHumidity(boolean hasHumidity);
}
