package cts.baias.bianca.g1089.builder;

public interface IBuilder {
    IBuilder transport(String transport);
    IBuilder accommodation(String accommodation);
    IBuilder extraActivities(String extraActivities);
    HolidayPackage build();
}
