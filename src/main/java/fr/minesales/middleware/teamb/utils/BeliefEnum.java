package fr.minesales.middleware.teamb.utils;

public enum BeliefEnum {
    BAD(0),
    GOOD(1);

    private final int belief;

    BeliefEnum(int belief) {
        this.belief = belief;
    }

    public int getValue() {
        return belief;
    }

    @Override
    public String toString() {
        return BeliefTranslator.toString(belief);
    }
}
