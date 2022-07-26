package fr.minesales.middleware.teamb.entities;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Stream;

public class Squad {

    private final int belief;

    private Collection<Hero> member;

    public Squad(int belief) {
        this.belief = belief;

        member = new HashSet<>();
    }

    public boolean addMember(Hero hero) {
        return member.add(hero);
    }
    public boolean removeMember(Hero hero) {
        return member.remove(hero);
    }

    public int getBelief() {
        return belief;
    }

    /**
     *
     * @return sum of all Hero's power.
     */
    public int getPower(){
        return member.stream()
                .flatMap(hero -> Stream.of(hero.getPower()))
                .reduce(0, Integer::sum);
    }

    /**
     *
     * @return sum of all Hero's will.
     */
    public int getWill(){
        return member.stream()
                .flatMap(hero -> Stream.of(hero.getWill()))
                .reduce(0, Integer::sum);
    }

    /**
     *
     * @return sum of all Hero's magic.
     */
    public int getMagic(){
        return member.stream()
                .flatMap(hero -> Stream.of(hero.getMagic()))
                .reduce(0, Integer::sum);
    }

    public int getValue(){
        return getPower() + getWill() + getMagic();
    }

    @Override
    public String toString() {
        return "Squad{" +
                "belief=" + belief +
                "value=" + getValue() +
                '}';
    }
}
