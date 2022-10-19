package lab2.mymoves.Zekrom;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(double pow, double acc) {

        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect.confuse(p);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect d = new Effect().stat(Stat.ATTACK, 2);

        p.addEffect(d);
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}