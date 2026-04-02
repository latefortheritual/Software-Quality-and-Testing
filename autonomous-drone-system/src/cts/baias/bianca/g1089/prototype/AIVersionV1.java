package cts.baias.bianca.g1089.prototype;

public class AIVersionV1 extends AutonomousDriving {
    public AIVersionV1() throws InterruptedException { super("V1"); }

    @Override
    public void applyRule(int index, String context) {
        if (index < getDecisionRules().size())
            System.out.println("[V1] Context: " + context + " → " + getDecisionRules().get(index));
    }
}