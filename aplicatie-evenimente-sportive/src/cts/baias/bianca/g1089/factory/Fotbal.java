package cts.baias.bianca.g1089.factory;

public class Fotbal extends Sport{
    public Fotbal(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public String getTipSport() {
        return "Fortbal";
    }
}
