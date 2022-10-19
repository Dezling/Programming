package lab2.mymoves.Tangela;


import ru.ifmo.se.pokemon.*;

public class SwordDance extends StatusMove {

    public SwordDance(double pow, double acc) {

        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        Effect d = new Effect().stat(Stat.ATTACK, 2);

        p.addEffect(d);
    }
    @Override
    protected String describe() {
        return "использует Sword Dance";
    }
}