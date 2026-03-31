import cts.baias.bianca.g1089.simplefactory.FieldReport;
import cts.baias.bianca.g1089.simplefactory.FieldReportFactory;
import cts.baias.bianca.g1089.simplefactory.FieldReportType;
import cts.baias.bianca.g1089.singleton.ConexiuneBazaControl;
import cts.baias.bianca.g1089.singleton.ConexiuneGPS;
import cts.baias.bianca.g1089.singleton.ConexiuneMeteo;

void main() {
    ConexiuneGPS conexiuneGPS = ConexiuneGPS.getInstance();
    conexiuneGPS.connect();

    ConexiuneMeteo conexiuneMeteo = ConexiuneMeteo.getInstance();
    conexiuneMeteo.connect();

    ConexiuneBazaControl conexiuneBazaControl = ConexiuneBazaControl.getInstance();
    conexiuneBazaControl.connect();

    ConexiuneGPS conexiuneGPS1 = ConexiuneGPS.getInstance();
    System.out.println(conexiuneGPS == conexiuneGPS1); //true


    FieldReportFactory factory = new FieldReportFactory();

    FieldReport infoReport = factory.makeReport(FieldReportType.INFO);
    infoReport.report();

    FieldReport alertReport = factory.makeReport(FieldReportType.ALERT);
    alertReport.report();

    FieldReport warningReport = factory.makeReport(FieldReportType.WARNING);
    warningReport.report();

    FieldReport infoReportAgain = factory.makeReport(FieldReportType.INFO);
    infoReportAgain.report();
}
