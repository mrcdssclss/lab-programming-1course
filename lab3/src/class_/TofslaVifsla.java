package class_;
import abstract_.Character;
import interface_.Alive;
public class TofslaVifsla extends Character implements Alive {
    public class Names {
        public String Tofsla(){
            return "Тофсла";
        }
        public String Vifsla(){
            return "Вифсла";
        }
    }
    public String shaking(){return "радостно закивали";}

    public String standing(){return "стали по обе стороны";}

    public String talking() {return "не отвечали";}

    public String counting(){return "просчитали";}

    public String opening(){return "отщелкнули замок";}
}
