package lab2.mypokemons;

import lab2.mymoves.Tangela.GigaDrain;
import lab2.mymoves.Tangela.Growth;
import lab2.mymoves.Tangela.SwordDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tangela extends Pokemon {
    public Tangela(String name, int level){
        super(name, level);

        super.setType(Type.GRASS);
        super.setStats(65, 55, 115, 100, 40, 60);

        GigaDrain gigaDrain = new GigaDrain();
        Growth growth = new Growth(100, 20);
        SwordDance swordDance = new SwordDance(100, 20);

        super.setMove(gigaDrain, growth, swordDance);
    }
}
