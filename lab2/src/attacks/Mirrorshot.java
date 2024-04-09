package attacks;

import ru.ifmo.se.pokemon.*;
public class Mirrorshot extends SpecialMove {
    public Mirrorshot(double pow, double acc){
        super(Type.STEEL, pow, acc);
    }

    protected String describe() {return "использует Mirror Shot";}

    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random()*100 <= 30) {
            pokemon.setMod(Stat.ACCURACY, -1);
        }
    }
}
