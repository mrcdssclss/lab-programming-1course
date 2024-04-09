package class_;
import abstract_.Character;
import interface_.NotAlive;

public class Ruby extends Character implements NotAlive {
    @Override
    public String changeable(){return "был изменчив";}
    @Override
    public String reyal(){
        return null;
    }
    public String shining() {return null;}
    public String laying() {
        class BeAs{
            public static String SunDown(){
                return "рдеющий, как закат, живой, как огонь";
            }
        }
        return BeAs.SunDown();
    }
}
