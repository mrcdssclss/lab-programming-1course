package attacks;
import ru.ifmo.se.pokemon.*;
public class Swagger extends StatusMove {
    public Swagger(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    protected String describe() {return "использует Swagger";}

    protected void applyOppEffects(Pokemon pokemon){
        Effect.confuse(pokemon);
    }
}
