package cts.baias.bianca.g1089.factory;

public class SensorReportFactory extends AbstractReportFactory {
    public AbstractAirQualityReport createReport(double pm25) {
        if (pm25 <= 30) return new CleanAirReport(pm25);
        if (pm25 <= 70) return new WarningReport(pm25);
        return new HealthRiskReport(pm25);
    }
}