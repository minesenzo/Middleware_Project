package fr.minesales.middleware.teamb.utils;

public class BeliefTranslator {

    private static final String badBelief = "Bad";
    private static final String goodBelief = "Good";

    public static String toString(int belief){
        switch (belief){
            case 0: return badBelief;
            case 1: return goodBelief;
            default: throw new IllegalArgumentException("Belief parameter needs to be 0 or 1. Current value : " + belief);
        }
    }

    public static int toValue(String belief) {
        switch (belief){
            case badBelief: return 0;
            case goodBelief: return 1;
            default:
                throw new IllegalArgumentException("Belief parameter needs to be " +
                        "BeliefTranslator.badBelief or BeliefTranslator.goodBelief. " +
                        "Current value : " + belief);
        }
    }
}
