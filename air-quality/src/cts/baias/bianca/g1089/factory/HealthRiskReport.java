package cts.baias.bianca.g1089.factory;

public class HealthRiskReport implements AbstractAirQualityReport{
    private double pm25;

    public HealthRiskReport(double pm25) {
        this.pm25 = pm25;
    }

    @Override
    public void displayReport() {
        System.out.println("Risc sanatate. PM2.5=" + pm25);
    }
}
