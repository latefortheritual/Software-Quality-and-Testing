import cts.baias.bianca.g1089.factory.ITransmissionFactory;
import cts.baias.bianca.g1089.factory.TipSport;
import cts.baias.bianca.g1089.prototype.Live;
import cts.baias.bianca.g1089.prototype.Transmission;

void main() {
    Live prototype = new Transmission(null);

    Live proTv = prototype.clone();
    proTv.setStreamingService("ProTV");

    Live romaniaTv = prototype.clone();
    romaniaTv.setStreamingService("RomaniaTV");

    Live digi24 = prototype.clone();
    digi24.setStreamingService("Digi24");

    proTv.addComment("Comentariu proTV");
    romaniaTv.addComment("Comentariu romaniaTV");

    // demonstram ca listele sunt independente
    System.out.println("ProTV:");
    proTv.seeComments();

    System.out.println("RomaniaTV:");
    romaniaTv.seeComments();

    System.out.println("Digi24:");
    digi24.seeComments(); // lista goala — demonstreaza deep copy


    // factory method — sport ales la runtime prin enum
    // nu exista nicio referinta la FotbalFactory, BaschetFactory, HandbalFactory
    ITransmissionFactory factory1 = TipSport.FOTBAL.getFactory();
    Live fotbal = factory1.createTransmisiune("Steaua", "Dinamo");
    fotbal.setStreamingService("ProTV");

    ITransmissionFactory factory2 = TipSport.BASCHET.getFactory();
    Live baschet = factory2.createTransmisiune("CSM", "Dinamo");
    baschet.setStreamingService("DigiSport");

    ITransmissionFactory factory3 = TipSport.HANDBAL.getFactory();
    Live handbal = factory3.createTransmisiune("Dinamo", "SCM");
    handbal.setStreamingService("RomaniaTV");

    System.out.println(fotbal);
    System.out.println(baschet);
    System.out.println(handbal);

}
