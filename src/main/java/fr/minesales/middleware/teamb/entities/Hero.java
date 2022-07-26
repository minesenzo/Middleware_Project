package fr.minesales.middleware.teamb.entities;

import fr.minesales.middleware.teamb.utils.BeliefTranslator;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class represent a character of the game.<br>
 * A Hero has a name (unique), belief (bad-good), power, will, magic (all as int).<br>
 * Heroes form Squad
 * @see Squad
 */
@Getter
public class Hero {
    /**
     * Unique ID
     */
    private String name;
    /**
     * Belief is an integer between 0 and 1.<br>
     * If the value is set to 0, the Hero will be <strong>bad</strong><br>
     * If the value is set to 1, the Hero will be <strong>good</strong>
     */
    private final int belief;

    /**
     * Statistical values of this Hero.<br>
     * The sum of these values describe the Hero's strength.
     */
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
