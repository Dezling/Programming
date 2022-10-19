package lab2.mymoves.Zekrom;

import ru.ifmo.se.pokemon.*;



public class ChargeBeam extends PhysicalMove {
    public ChargeBeam(double pow, double acc){
        super(Type.NORMAL, pow, acc);


    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() <= 0.7) {
            p.setMod(Stat.ATTACK, 1);
        }

    }

    @Override
    protected String describe() {
        return "использует Charge Beam";
    }


}
