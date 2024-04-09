package attacks;

import ru.ifmo.se.pokemon.*;
public class IcyWind extends SpecialMove{
    public IcyWind(double pow, double acc) {
        super(Type.ICE, pow, acc);
    }
    protected String describe() {
        return "использует Icy Wind";
    }
}
