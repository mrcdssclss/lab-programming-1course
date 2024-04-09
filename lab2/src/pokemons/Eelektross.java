package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.Thunder;
public class Eelektross extends Eelektrik {
    public Eelektross (String name, int level){
        super (name, level);
        super.setStats(85, 115, 80, 105, 80, 50);
        super.setType(Type.ELECTRIC);
        addMove(new Thunder(110, 70));
    }
}
