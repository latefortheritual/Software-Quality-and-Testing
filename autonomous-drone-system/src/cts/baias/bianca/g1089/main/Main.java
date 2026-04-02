package cts.baias.bianca.g1089.main;

import cts.baias.bianca.g1089.prototype.*;
import cts.baias.bianca.g1089.singleton.DroneConnection;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        AIVersionV1 v1 = new AIVersionV1();
        v1.addDecisionRule("Evita obstacole la distanta < 2m");
        v1.addDecisionRule("Urmareste traseul predefinit");

        AIVersionV2 v2 = new AIVersionV2();
        v2.addDecisionRule("Evita obstacole la distanta < 1m");
        v2.addDecisionRule("Recalculeaza traseul la fiecare 10s");

        AIVersionV3 v3 = new AIVersionV3();
        v3.addDecisionRule("Detectie obiecte prin camera IR");
        v3.addDecisionRule("Aterizare automata la baterie < 10%");


        AutonomousDriving clone1 = v1.clone();
        AutonomousDriving clone2 = v1.clone();
        AutonomousDriving clone3 = v2.clone();
        AutonomousDriving clone4 = v2.clone();
        AutonomousDriving clone5 = v3.clone();


        System.out.println("\n--- Obiecte create ---");
        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);
        System.out.println(clone4);
        System.out.println(clone5);


        System.out.println("\n--- Aplicare reguli ---");
        clone1.applyRule(0, "obstacol detectat");
        clone3.applyRule(1, "zbor autonom");
        clone5.applyRule(1, "baterie 9%");


        // singleton
        System.out.println("\n--- DroneConnection ---");
        DroneConnection conn1 = DroneConnection.getInstance();
        DroneConnection conn2 = DroneConnection.getInstance();
        System.out.println("Same instance: " + (conn1 == conn2)); // true

        conn1.connectUser("user1");
        conn1.connectUser("user2");
        conn2.connectUser("user3");
        conn2.connectUser("user1"); // already connected

        System.out.println("\n--- Channels ---");
        System.out.println("user1: " + conn1.getDedicatedChannel("user1"));
        System.out.println("user2: " + conn1.getDedicatedChannel("user2"));
        System.out.println("user3: " + conn2.getDedicatedChannel("user3"));

        System.out.println("\n--- Is connected ---");
        System.out.println("user1 connected: " + conn1.isUserConnected("user1"));
        conn1.disconnectUser("user1");
        System.out.println("user1 connected: " + conn1.isUserConnected("user1"));
    }
}
