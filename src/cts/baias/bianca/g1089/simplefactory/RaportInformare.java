package cts.baias.bianca.g1089.simplefactory;

import java.time.LocalDateTime;

public class RaportInformare implements FieldReport{
    RaportInformare() {
    }
    @Override
    public void report() {
        System.out.println("Reporting info at " + LocalDateTime.now());
    }
}
