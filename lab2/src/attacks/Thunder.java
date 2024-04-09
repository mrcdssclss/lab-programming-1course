package attacks;

import ru.ifmo.se.pokemon.*;
public class Thunder extends SpecialMove {
    public Thunder(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);
    }

    protected String describe() {return "использует Spark";}

    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random()*100 <=30){
            Effect.paralyze(pokemon);
        }
    }
}
