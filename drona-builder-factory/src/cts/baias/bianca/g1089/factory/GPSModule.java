package cts.baias.bianca.g1089.factory;

public class GPSModule extends AbstractModule{
    private String sateliteProvider;
    private float acuratete;

    public void setSateliteProvider(String sateliteProvider) {
        this.sateliteProvider = sateliteProvider;
    }

    public void setAcuratete(float acuratete) {
        this.acuratete = acuratete;
    }

    public GPSModule() {
        this.name = "GPS Module";
        this.description = "Modul de tracking GPS";
        this.price = 299.99f;
        System.out.println("Modul GPS creat cu succes");
    }

    @Override
    public String toString() {
        return "GPSModule{" +
                "sateliteProvider='" + sateliteProvider + '\'' +
                ", acuratete=" + acuratete +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
