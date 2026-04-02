package cts.baias.bianca.g1089.factory;

public class Handbal extends Sport{
    public Handbal(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public String getTipSport() {
        return "Handbal";
    }
}
