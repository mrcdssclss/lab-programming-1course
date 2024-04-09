package attacks;

import ru.ifmo.se.pokemon.*;
public class RockSlide extends PhysicalMove {
    public RockSlide(double pow, double acc) {
        super(Type.ROCK, pow, acc);
    }
    protected String describe() { return "использует Rock Slide";}

    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random()*100 <= 30) {
            Effect.flinch(pokemon);
        }
    }
}
