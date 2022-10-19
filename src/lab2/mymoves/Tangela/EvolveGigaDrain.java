package lab2.mymoves.Tangela;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class EvolveGigaDrain extends SpecialMove {
    public int restoringHealth ;


    public EvolveGigaDrain() {
        super(Type.GRASS, 75, 100);

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP,  - 10);
    }
    @Override
    protected String describe() {
        return "Использует GigaDrain";
    }
}
