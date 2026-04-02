package cts.baias.bianca.g1089.factory;

public abstract class Sport {
    protected String echipaGazda;
    protected String echipaOaspete;

    public Sport(String echipaGazda, String echipaOaspete) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
    }

    public abstract String getTipSport();

    @Override
    public String toString() {
        return "Sport{" +
                "echipaGazda='" + echipaGazda + '\'' +
                ", echipaOaspete='" + echipaOaspete + '\'' +
                '}';
    }
}
