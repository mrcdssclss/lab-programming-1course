package attacks;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(double pow, double acc) {
        super(Type.GROUND, pow, acc);
    }
    protected String describe(){return "использует Bulldoze";}


}
