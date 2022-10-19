package lab2.mymoves.Poliwag;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic() {
            super(Type.PSYCHIC, 90, 100);
        }
        @Override
        protected void applyOppEffects(Pokemon p) {
            super.applyOppEffects(p);

            if(Program.chance(0.3)){
                Effect e = new Effect().turns(1).stat(Stat.SPECIAL_DEFENSE, -6);
                p.addEffect(e);

            }
            if (Program.chance(0.1)){
                Effect s = new Effect().turns(1).stat(Stat.SPECIAL_DEFENSE, -6).stat(Stat.SPECIAL_ATTACK, -6);
                p.addEffect(s);
            }
        }
        @Override
        protected String describe() {
            return "Использует Psychic";
        }
    }




