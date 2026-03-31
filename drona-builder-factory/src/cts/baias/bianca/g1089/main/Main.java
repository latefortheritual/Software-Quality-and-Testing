import cts.baias.bianca.g1089.builder.Drone;
import cts.baias.bianca.g1089.factory.*;

void main() {
    //builder
    Drone d1 = Drone.getBuilder("comercial", "v1").setGreutate(123.5f).build();
    Drone d2 = Drone.getBuilder("non-comercial", "v2").setAutonomieBaterie(2000).build();

    System.out.println(d1);
    System.out.println(d2);


    //factory
    IModuleFactory factory = new GPSModuleFactory();
    GPSModule gps = (GPSModule) factory.createModule();
    gps.setSateliteProvider("Galileo");

    IModuleFactory factory2 = new NightVisionFactory();
    NightVisionModule nightVision = (NightVisionModule) factory2.createModule();
    nightVision.setTehnologie("infrarosu");
    nightVision.setDistantaMaxima(150.0f);

    IModuleFactory factory3 = new HighResCameraFactory();
    HighResCameraModule camera = (HighResCameraModule) factory3.createModule();
    camera.setRezolutie(4000);
    camera.setUnghi(120.0f);

    System.out.println(gps);
    System.out.println(nightVision);
    System.out.println(camera);
}
