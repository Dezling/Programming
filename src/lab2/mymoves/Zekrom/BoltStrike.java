package lab2.mymoves.Zekrom;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class BoltStrike extends PhysicalMove {

    public BoltStrike(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);


    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (Program.chance(0.2)){
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        return "использует BoltStrike";
    }
}
