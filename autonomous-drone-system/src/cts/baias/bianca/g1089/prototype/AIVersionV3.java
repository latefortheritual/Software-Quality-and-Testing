package cts.baias.bianca.g1089.prototype;

public class AIVersionV3 extends AutonomousDriving {
    public AIVersionV3() throws InterruptedException { super("V3"); }

    @Override
    public void applyRule(int index, String context) {
        if (index < getDecisionRules().size())
            System.out.println("[V3] Context: " + context + " → " + getDecisionRules().get(index));
    }
}