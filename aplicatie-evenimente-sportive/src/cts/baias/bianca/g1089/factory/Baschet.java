package cts.baias.bianca.g1089.factory;

public class Baschet extends Sport{
    public Baschet(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public String getTipSport() {
        return "Baschet";
    }
}
