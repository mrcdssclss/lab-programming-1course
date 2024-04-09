package attacks;

import ru.ifmo.se.pokemon.*;
public class ChargeBeam extends SpecialMove {

    public ChargeBeam(double pow, double acc) {
        super(Type.ELECTRIC, pow, acc);
    }
    protected String describe() {return "использует Charge Beam";}

    protected void applySelfEffects(Pokemon pokemon){
        if (Math.random()*100 <= 70) {
            pokemon.setMod(Stat.SPECIAL_ATTACK, +1);
        }
    }
}
