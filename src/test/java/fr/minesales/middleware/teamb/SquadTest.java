package fr.minesales.middleware.teamb;

import fr.minesales.middleware.teamb.entities.Hero;
import fr.minesales.middleware.teamb.entities.Squad;
import fr.minesales.middleware.teamb.factories.HeroFactory;
import fr.minesales.middleware.teamb.factories.SquadFactory;
import fr.minesales.middleware.teamb.utils.BeliefEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SquadTest {

    @Test
    public void ConstructorTest() {
        Squad squad = new Squad(0);

        Assertions.assertNotNull(squad);
        Assertions.assertEquals(0, squad.getBelief());
    }

    @Test
    public void AddMemberTest() {
        Squad squad = new Squad(BeliefEnum.BAD.getValue());

        HeroFactory heroFactory = new HeroFactory();
        Hero hero = heroFactory.createHero(squad.getBelief());

        boolean result = squad.addMember(hero);

        Assertions.assertNotNull(squad);
        Assertions.assertNotNull(heroFactory);
        Assertions.assertNotNull(hero);
        Assertions.assertTrue(result);
    }

    @Test
    public void RemoveMemberTest() {
        Squad squad = new Squad(BeliefEnum.BAD.getValue());

        HeroFactory heroFactory = new HeroFactory();
        Hero hero = heroFactory.createHero(squad.getBelief());

        Assertions.assertNotNull(squad);
        Assertions.assertNotNull(heroFactory);
        Assertions.assertNotNull(hero);
        Assertions.assertTrue(squad.addMember(hero));
        Assertions.assertTrue(squad.removeMember(hero));
    }

    @Test
    public void FactoryTest() {
        SquadFactory factory = new SquadFactory();

        Squad squad = factory.createSquad(BeliefEnum.GOOD.getValue(), 2);

        Assertions.assertNotNull(factory);
        Assertions.assertNotNull(squad);
    }

    @Test
    public void ValuesTest() {
        Hero h1 = new Hero("h1", BeliefEnum.GOOD.getValue(), 10, 20, 30);
        Hero h2 = new Hero("h2", BeliefEnum.GOOD.getValue(), 15, 25, 35);

        Squad squad = new Squad(BeliefEnum.GOOD.getValue());

        squad.addMember(h1);
        squad.addMember(h2);

        Assertions.assertNotNull(h1);
        Assertions.assertNotNull(h2);
        Assertions.assertNotNull(squad);
        Assertions.assertEquals(1, h1.getBelief());
        Assertions.assertEquals(1, h2.getBelief());
        Assertions.assertEquals(1, squad.getBelief());
        Assertions.assertEquals(25, squad.getPower());
        Assertions.assertEquals(45, squad.getWill());
        Assertions.assertEquals(65, squad.getMagic());
        Assertions.assertEquals(25+45+65, squad.getValue());
    }
}
