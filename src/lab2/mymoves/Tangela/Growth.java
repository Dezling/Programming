package lab2.mymoves.Tangela;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove {
    public Growth(double pow, double acc) {
        super(Type.NORMAL, pow, acc);}
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect a = new Effect().stat(Stat.ATTACK, 1);

        p.addEffect(a);
    }
    @Override
    protected String describe() {
        return "исспользует Growth";
    }
}

