package cts.baias.bianca.g1089.simplefactory;

import java.time.LocalDateTime;

public class RaportAlertare implements FieldReport{
     RaportAlertare() {
    }
    @Override
    public void report() {
        System.out.println("Alerting at " + LocalDateTime.now());
    }
}
