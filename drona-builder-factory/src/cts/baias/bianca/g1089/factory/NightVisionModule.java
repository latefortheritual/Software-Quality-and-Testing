package cts.baias.bianca.g1089.factory;

public class NightVisionModule extends AbstractModule{
    private float distantaMaxima;
    private String tehnologie;

    public void setDistantaMaxima(float distantaMaxima) {
        this.distantaMaxima = distantaMaxima;
    }

    public void setTehnologie(String tehnologie) {
        this.tehnologie = tehnologie;
    }

    public NightVisionModule() {
        this.name = "Night Vision Module";
        this.description = "Modul de vedere pe timp de noapte";
        this.price = 499.99f;
        System.out.println("Modul Night Vision creat cu succes");
    }

    @Override
    public String toString() {
        return "NightVisionModule{" +
                "distantaMaxima=" + distantaMaxima +
                ", tehnologie='" + tehnologie + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
