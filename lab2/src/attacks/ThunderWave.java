package attacks;

import ru.ifmo.se.pokemon.*;
public class ThunderWave extends StatusMove {
    public ThunderWave(double pow, double acc) {
        super(Type.ELECTRIC, pow, acc);
    }

    protected String describe() {
        return "использует Thunder Wave";
    }

    protected void applyOppEffects(Pokemon pokemon) {
        Effect.paralyze(pokemon);
    }
}