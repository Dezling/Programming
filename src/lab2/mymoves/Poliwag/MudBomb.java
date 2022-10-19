package lab2.mymoves.Poliwag;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class MudBomb extends SpecialMove {
    public MudBomb(){
        super(Type.GROUND, 65,85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);


        if(Program.chance(0.3)){
            Effect e = new Effect().turns(1).stat(Stat.ACCURACY, -6);
            p.addEffect(e);

        }
    }
        @Override
        protected String describe() {
            return "исспользует Mud Bomb";
        }
}



