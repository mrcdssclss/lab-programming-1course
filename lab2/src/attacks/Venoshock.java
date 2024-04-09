package attacks;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
    public Venoshock(double pow, double acc) {
        super(Type.POISON, pow, acc);
    }

    protected String describe() {
        return "использует Venoshock";
    }

    private boolean status = false;

    protected void applyOppEffects(Pokemon pokemon) {
        if (pokemon.getCondition() == Status.POISON) status = true;
    }
    protected void applySelfEffect (Pokemon pokemon){
        if (status) {
            pokemon.setMod(Stat.ATTACK, (int) (power * 2));
            }
        }
    }
