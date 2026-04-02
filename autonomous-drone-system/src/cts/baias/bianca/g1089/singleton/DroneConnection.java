package cts.baias.bianca.g1089.singleton;

import java.util.HashMap;
import java.util.Map;

public class DroneConnection implements IDroneConnection {
    private static final DroneConnection instance = new DroneConnection();
    private Map<String, String> userChannels = new HashMap<>();
    private int channelCounter = 0;

    private DroneConnection() {}

    public static DroneConnection getInstance() { return instance; }

    @Override
    public void connectUser(String userId) {
        if (!userChannels.containsKey(userId)) {
            channelCounter++;
            userChannels.put(userId, "Channel-" + channelCounter);
            System.out.println(userId + " connected on " + userChannels.get(userId));
        } else {
            System.out.println(userId + " already connected on " + userChannels.get(userId));
        }
    }

    @Override
    public void disconnectUser(String userId) {
        userChannels.remove(userId);
        System.out.println(userId + " disconnected.");
    }

    @Override
    public boolean isUserConnected(String userId) { return userChannels.containsKey(userId); }

    @Override
    public String getDedicatedChannel(String userId) { return userChannels.get(userId); }
}