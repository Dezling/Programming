package lab2.mypokemons;

import lab2.mymoves.Tangela.*;
import ru.ifmo.se.pokemon.Type;

public class Tangrowth extends Tangela {
    public Tangrowth(String name, int level){
        super(name, level);

        super.setType(Type.GRASS);
        super.setStats(100, 100, 125, 110, 50, 50);

        EvolveGigaDrain evolveGigaDrain = new EvolveGigaDrain();
        Growth growth = new Growth(1, 1);
        SwordDance swordDance = new SwordDance(1, 1);
        RockTomb rockTomb = new RockTomb();

        super.setMove(evolveGigaDrain, growth, swordDance, rockTomb);
    }
}