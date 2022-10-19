package lab2.mypokemons;

import lab2.mymoves.Poliwag.Facade;
import lab2.mymoves.Poliwag.MudBomb;
import lab2.mymoves.Poliwag.Psychic;
import lab2.mymoves.Poliwag.Submission;
import ru.ifmo.se.pokemon.Type;

public class Poliwrath extends Poliwhirl{
    public Poliwrath(String name, int level){
        super(name, level);

        super.setType(Type.WATER);
        super.setStats(65, 65, 65, 50,50,90);

        Psychic psychic = new Psychic();
        Facade facade = new Facade();
        MudBomb mudBomb = new MudBomb();
        Submission submission = new Submission(80,80);

        super.setMove(psychic, facade, mudBomb, submission);}
}
