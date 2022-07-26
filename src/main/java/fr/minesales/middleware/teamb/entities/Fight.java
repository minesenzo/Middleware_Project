package fr.minesales.middleware.teamb.entities;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Fight {
    private final Squad[] fighters;

    public Fight(Squad... fighters) {
        if(fighters.length != 2 || fighters[0].getBelief() == fighters[1].getBelief()) {
            throw new IllegalArgumentException("A fight must be between two squads of different belief. " +
                    "Current configuration : " + Arrays.toString(fighters));
        } else {
            this.fighters = fighters;
        }
    }

    public Squad[] getFighters() {
        return fighters;
    }

    public Squad getWinner() {
        Optional<Squad> optionalWinner = Arrays.stream(fighters)
                .max(Comparator.comparingInt(Squad::getValue));

        if(optionalWinner.isPresent()){
            return optionalWinner.get();
        } else {
            throw new RuntimeException("Winner not found, maybe squad have the same value.");
        }
    }
}
