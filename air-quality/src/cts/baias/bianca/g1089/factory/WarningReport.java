package cts.baias.bianca.g1089.factory;

public class WarningReport implements AbstractAirQualityReport{
    private double pm25;

    public WarningReport(double pm25) {
        this.pm25 = pm25;
    }

    @Override
    public void displayReport() {
        System.out.println("Avertizare. PM2.5=" + pm25);
    }
}
