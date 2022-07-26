package fr.minesales.middleware.teamb.factories;

import fr.minesales.middleware.teamb.entities.Hero;

import java.util.Random;

public class HeroFactory {

    public Hero createHero(int belief) {
        Random random = new Random();
        return createHero("Random Dude", belief, random.nextInt(), random.nextInt(), random.nextInt());
    }

    public Hero createHero(String name, int belief, int power, int will, int magic) {
        return new Hero(name, belief, power, will, magic);
    }
}
