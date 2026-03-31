package cts.baias.bianca.g1089.simplefactory;

import java.time.LocalDateTime;

public class RaportAvertizare implements FieldReport{
    RaportAvertizare() {
    }
    @Override
    public void report() {
        System.out.println("Warning at " + LocalDateTime.now());
    }
}
