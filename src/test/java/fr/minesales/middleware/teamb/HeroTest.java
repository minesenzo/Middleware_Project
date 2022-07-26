package fr.minesales.middleware.teamb;

import fr.minesales.middleware.teamb.entities.Hero;
import fr.minesales.middleware.teamb.factories.HeroFactory;
import fr.minesales.middleware.teamb.utils.BeliefEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HeroTest {

    @Test
    public void constructorTest(){
        Hero hero = new Hero("Test", 1, 2, 3, 4);

        Assertions.assertEquals("Test", hero.getName());
        Assertions.assertEquals(1, hero.getBelief());
        Assertions.assertEquals(2, hero.getPower());
        Assertions.assertEquals(3, hero.getWill());
        Assertions.assertEquals(4, hero.getMagic());
    }

    @Test
    public void factoryTest1(){
        HeroFactory factory = new HeroFactory();

        factory.createHero(BeliefEnum.GOOD.getValue());
    }

    @Test
    public void factoryTest2(){
        HeroFactory factory = new HeroFactory();

        Hero hero = factory.createHero("Random Dude", BeliefEnum.BAD.getValue(), 2, 3, 4);

        Assertions.assertEquals("Random Dude", hero.getName());
        Assertions.assertEquals(0, hero.getBelief());
        Assertions.assertEquals(2, hero.getPower());
        Assertions.assertEquals(3, hero.getWill());
        Assertions.assertEquals(4, hero.getMagic());
    }

    @Test
    public void factoryTest3(){
        HeroFactory factory = new HeroFactory();

        Hero hero = factory.createHero(BeliefEnum.GOOD.getValue());

        Assertions.assertEquals("Random Dude", hero.getName());
        Assertions.assertEquals(1, hero.getBelief());
    }
}
