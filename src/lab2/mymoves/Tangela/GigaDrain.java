package lab2.mymoves.Tangela;

import ru.ifmo.se.pokemon.*;

public class GigaDrain extends SpecialMove {

    public GigaDrain() {
        super(Type.GRASS, 75, 100);

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
      p.setMod(Stat.HP,  - 5);
    }
    @Override
    protected String describe() {
        return "Использует GigaDrain";
    }
}
