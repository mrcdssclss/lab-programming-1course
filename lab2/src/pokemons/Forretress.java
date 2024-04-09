package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.Mirrorshot;
public class Forretress extends Pineco {
    public Forretress (String name, int level) {
        super (name, level);
        super.setStats(75, 90, 140, 60, 60, 40);
        super.setType(Type.STEEL, Type.BUG);
        addMove(new Mirrorshot(65,85));
    }

}
