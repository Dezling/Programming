package lab2.mymoves.Zekrom;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(double pow, double acc){
        super(Type.NORMAL, pow, acc);


    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() <= 1.0/8.0) {
            System.out.println("Критический урон от Stone Edge!");
            return 2.0;
        }
        return 1.0;
    }

    @Override
    protected String describe() {
        return "исспользует Stone Edge";
    }
}
