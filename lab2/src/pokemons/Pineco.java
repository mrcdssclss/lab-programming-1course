package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.Venoshock;
import attacks.Tackle;
import attacks.Bulldoze;
public class Pineco extends Pokemon {
    public Pineco(String name, int level) {
        super (name, level);
        super.setStats(50, 65, 90, 35, 35, 15);
        super.setType(Type.BUG);
        setMove(new Venoshock(65,100), new Tackle(40,100), new Bulldoze(60,100));
    }
}
