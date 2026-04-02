package cts.baias.bianca.g1089.prototype;

import java.util.ArrayList;
import java.util.List;

public abstract class AutonomousDriving implements Cloneable {
    private String version;
    private List<String> decisionRules = new ArrayList<>();

    public AutonomousDriving(String version) throws InterruptedException {
        this.version = version;
        System.out.println("Start AI module....");
        Thread.sleep(5000);
        System.out.println("Init AI module....learning done");
    }

    public void addDecisionRule(String rule) { decisionRules.add(rule); }
    public String getVersion() { return version; }
    public List<String> getDecisionRules() { return decisionRules; }

    public abstract void applyRule(int index, String context);

    @Override
    public AutonomousDriving clone() {
        try {
            AutonomousDriving clone = (AutonomousDriving) super.clone();
            clone.decisionRules = new ArrayList<>(this.decisionRules);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return version + " | rules: " + decisionRules;
    }
}