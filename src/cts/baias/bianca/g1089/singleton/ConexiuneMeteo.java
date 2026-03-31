package cts.baias.bianca.g1089.singleton;

public class ConexiuneMeteo implements ServiceConnection {
    private static ConexiuneMeteo instance = new ConexiuneMeteo();
    private boolean isConnected;


    private ConexiuneMeteo() {
        this.isConnected = false;
    }

    public static ConexiuneMeteo getInstance() {
        return instance;
    }

    @Override
    public void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Connecting to the Weather Service");
        } else {
            System.out.println("Already connected to the Weather Service");
        }
    }
}
