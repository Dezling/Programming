package lab2.mypokemons;

import lab2.mymoves.Zekrom.*;
import lab2.mymoves.Zekrom.BoltStrike;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zekrom extends Pokemon {
    public Zekrom (String name, int level){
        super(name,level);

        super.setType(Type.DRAGON, Type.ELECTRIC);
        super.setStats(100, 150, 120, 120, 100, 90);

        BoltStrike boltStrike = new BoltStrike(130, 85);
        Swagger swagger = new Swagger(0, 85);
        ChargeBeam chargeBeam = new ChargeBeam(50, 90);
        StoneEdge stoneEdge = new StoneEdge(100, 80);

        super.setMove(boltStrike, swagger, chargeBeam, stoneEdge);
    }
}
