package pokemons;

import attacks.IcyWind;
import attacks.RockSlide;
import attacks.Swagger;
import ru.ifmo.se.pokemon.*;
import attacks.ThunderWave;
public class Regice extends Pokemon {
    public Regice(String name, int level) {
        super (name, level);
        super.setStats(80, 50, 100, 100, 200, 50);
        super.setType(Type.ICE);
        setMove(new ThunderWave(0,90),new IcyWind(55, 95), new RockSlide(75,90), new Swagger(0, 85));

    }
}
