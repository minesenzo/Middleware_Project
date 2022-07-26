package fr.minesales.middleware.teamb.entities;

import fr.minesales.middleware.teamb.utils.BeliefTranslator;
import lombok.Getter;

@Getter
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
