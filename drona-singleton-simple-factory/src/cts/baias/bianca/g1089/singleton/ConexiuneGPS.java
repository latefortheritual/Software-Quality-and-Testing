package cts.baias.bianca.g1089.singleton;

public class ConexiuneGPS implements ServiceConnection{
    private static ConexiuneGPS instance = new ConexiuneGPS();
    private boolean isConnected;

    private ConexiuneGPS() {
        this.isConnected = false;
    }

    public static ConexiuneGPS getInstance(){
        return instance;
    }

    @Override
    public void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Connecting to the GPS Satellite Service");
        } else {
            System.out.println("Already connected to the GPS Satellite Service");
        }
    }

}
