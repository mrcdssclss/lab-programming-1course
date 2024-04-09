package class_;
import abstract_.Character;
import interface_.Alive;

public class MumiTroll extends Character implements Alive {

    public static class Cat {
        static String Meow() {
            return "умеет мяукать";
        }
    }
    @Override
    public String shaking() {
        return "покачал головой";
    }

    public String standing() {return "стоял на месте";}

    public String talking() {return "сказал";}

    public String counting() {return null;}

    public String opening() {return null;}
}
