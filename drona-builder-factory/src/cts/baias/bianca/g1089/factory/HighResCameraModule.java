package cts.baias.bianca.g1089.factory;

public class HighResCameraModule extends AbstractModule{
    private int rezolutie;
    private float unghi;

    public void setRezolutie(int rezolutie) {
        this.rezolutie = rezolutie;
    }

    public void setUnghi(float unghi) {
        this.unghi = unghi;
    }

    public HighResCameraModule() {
        this.name = "High Resolution Camera";
        this.description = "Camera de inalta rezolutie 4K";
        this.price = 399.99f;
        System.out.println("Modul Camera de inalta rezolutie creat cu succes");
    }

    @Override
    public String toString() {
        return "HighResCameraModule{" +
                "rezolutie=" + rezolutie +
                ", unghi=" + unghi +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
