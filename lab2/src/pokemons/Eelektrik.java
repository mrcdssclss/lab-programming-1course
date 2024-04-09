package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.Spark;

public class Eelektrik extends Tynamo {
    public Eelektrik (String name, int level) {
        super (name, level);
        super.setStats(65, 85, 70, 75, 70, 40);
        super.setType(Type.ELECTRIC);
        addMove(new Spark(65, 100));
    }
}
