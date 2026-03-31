package cts.baias.bianca.g1089.singleton;

public class ConexiuneBazaControl implements ServiceConnection{
    private static ConexiuneBazaControl instance = new ConexiuneBazaControl();
    private boolean isConnected;

    private ConexiuneBazaControl() {
        this.isConnected = false;
    }

    public static ConexiuneBazaControl getInstance() {
        return instance;
    }

    @Override
    public void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Connected to the Control Base");
        } else {
            System.out.println("Already connected to the Control Base");
        }
    }
}
