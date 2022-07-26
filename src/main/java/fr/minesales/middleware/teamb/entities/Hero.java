package fr.minesales.middleware.teamb.entities;

import fr.minesales.middleware.teamb.utils.BeliefTranslator;

public class Hero {
    private String name;
    private final int belief;
    private int power, will, magic;

    public Hero(String name, int belief, int power, int will, int magic) {
        this.name = name;
        this.belief = belief;
        this.power = power;
        this.will = will;
        this.magic = magic;
    }

    public String getName() {
        return name;
    }

    public int getBelief() {
        return belief;
    }

    public int getPower() {
        return power;
    }

    public int getWill() {
        return will;
    }

    public int getMagic() {
        return magic;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", belief=" + BeliefTranslator.toString(belief) + " (" + belief + ")" +
                ", power=" + power +
                ", will=" + will +
                ", magic=" + magic +
                '}';
    }
}
