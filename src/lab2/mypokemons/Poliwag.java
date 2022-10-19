package lab2.mypokemons;

import lab2.mymoves.Poliwag.Facade;
import lab2.mymoves.Poliwag.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwag extends Pokemon {
    public Poliwag(String name, int level){
        super(name, level);

        super.setType(Type.WATER);
        super.setStats(40,50,40,40,40,90);

        Psychic psychic = new Psychic();
        Facade facade = new Facade();

        super.setMove(psychic, facade);


    }
}

