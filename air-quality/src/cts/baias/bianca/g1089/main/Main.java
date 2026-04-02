import cts.baias.bianca.g1089.builder.AirQualitySensor;
import cts.baias.bianca.g1089.factory.AbstractReportFactory;
import cts.baias.bianca.g1089.factory.SensorReportFactory;

void main() {
    AbstractReportFactory factory = new SensorReportFactory();

    factory.createReport(15).displayReport();  // 0-30
    factory.createReport(50).displayReport();  // 31-70
    factory.createReport(90).displayReport();  // >71

    //builder

    // senzor complet
    AirQualitySensor s1 =  AirQualitySensor.getBuilder()
            .setHasPM25(true)
            .setHasPM10(true)
            .setHasVOC(true)
            .setHasCO2(true)
            .setHasCO(true)
            .setHasTemperature(true)
            .setHasHumidity(true)
            .build();

    AirQualitySensor s2 = AirQualitySensor.getBuilder()
            .setHasPM25(true)
            .setHasTemperature(true)
            .build();

    AirQualitySensor s3 = AirQualitySensor.getBuilder()
            .setHasCO2(true)
            .setHasCO(true)
            .setHasHumidity(true)
            .build();

    s1.displayCapabilities();
    s2.displayCapabilities();
    s3.displayCapabilities();
}
