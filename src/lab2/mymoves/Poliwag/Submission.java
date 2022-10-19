package lab2.mymoves.Poliwag;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Submission extends PhysicalMove {
    public Submission(double pow, double acc) {
        super(Type.FIGHTING, 80, 80);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        getStruggleMove();

    }

    @Override
    protected String describe() {
        return "Использует Submission";
    }
}
