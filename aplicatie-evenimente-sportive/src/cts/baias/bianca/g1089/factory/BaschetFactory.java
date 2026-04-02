package cts.baias.bianca.g1089.factory;

import cts.baias.bianca.g1089.prototype.Live;
import cts.baias.bianca.g1089.prototype.Transmission;

public class BaschetFactory implements ITransmissionFactory{
    @Override
    public Live createTransmisiune(String echipaGazda, String echipaOaspete) {
        Sport sport = new Baschet(echipaGazda, echipaOaspete);
        return new Transmission(sport);
    }
}
