package cts.baias.bianca.g1089.prototype;

public class AIVersionV2 extends AutonomousDriving {
    public AIVersionV2() throws InterruptedException { super("V2"); }

    @Override
    public void applyRule(int index, String context) {
        if (index < getDecisionRules().size())
            System.out.println("[V2] Context: " + context + " → " + getDecisionRules().get(index));
    }
}