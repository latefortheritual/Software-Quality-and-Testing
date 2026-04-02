package cts.baias.bianca.g1089.factory;

public class CleanAirReport implements AbstractAirQualityReport{
    private double pm25;

    public CleanAirReport(double pm25) {
        this.pm25 = pm25;
    }

    @Override
    public void displayReport() {
        System.out.println("Aer curat. PM2.5=" + pm25);
    }
}
