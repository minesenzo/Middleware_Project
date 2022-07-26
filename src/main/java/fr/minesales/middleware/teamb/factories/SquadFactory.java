package fr.minesales.middleware.teamb.factories;

import fr.minesales.middleware.teamb.entities.Squad;

public class SquadFactory {
    public Squad createSquad(int belief, int nbHeros) {
        Squad squad = new Squad(belief);

        HeroFactory heroFactory = new HeroFactory();

        for (int i = 0; i < nbHeros; i++) {
            squad.addMember(heroFactory.createHero(belief));
        }

        return squad;
    }
}
