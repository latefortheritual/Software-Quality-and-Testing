package cts.baias.bianca.g1089.simplefactory;

public class FieldReportFactory {
    public FieldReport makeReport(FieldReportType type) {
        if (type == FieldReportType.INFO) {
            return new RaportInformare();
        } else if (type == FieldReportType.WARNING) {
            return new RaportAvertizare();
        } else if (type == FieldReportType.ALERT) {
            return new RaportAlertare();
        } else {
            return null;
        }
    }
}
