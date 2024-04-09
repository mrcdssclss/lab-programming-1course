package pokemons;

import attacks.Thunder;
import ru.ifmo.se.pokemon.*;
import attacks.ThunderWave;
import attacks.ChargeBeam;
public class Tynamo extends Pokemon {
    public Tynamo (String name, int level) {
        super (name, level);
        super.setStats(35, 55, 40, 45, 40, 60);
        super.setType(Type.ELECTRIC);
        setMove(new ThunderWave(0, 90), new ChargeBeam(50,90), new Thunder(110, 70));
    }
}
