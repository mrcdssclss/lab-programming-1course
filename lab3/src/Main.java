import Exceptions.IsNotEndException;
import Exceptions.WrongNameException;
import interface_.Start;
import class_.*;


public class Main {

    public static void main(String[] args) throws WrongNameException{
        MumiTroll mumitroll = new MumiTroll();
        Otblesk otblesk = new Otblesk();
        Ruby ruby = new Ruby();
        SecretRoom room = new SecretRoom();
        Thoughts thoughts = new Thoughts();
        Time time = new Time();
        TofslaVifsla tofslaVifsla = new TofslaVifsla();
        TofslaVifsla.Names names = tofslaVifsla.new Names();
        mumitroll.setName("Муми Троль");
        otblesk.setName("отблеск");
        ruby.setName("рубин");
        room.setName("комната-тайник");
        thoughts.setName("мысли");
        time.setName("время");
        tofslaVifsla.setName("Тофсла и Вифсла");
        Start start;
        start = () -> "Начало:";
        story(mumitroll, otblesk, ruby, room, thoughts, time, tofslaVifsla, names, start);
    }

    private static void story(MumiTroll mumitroll, Otblesk otblesk, Ruby ruby, SecretRoom room, Thoughts thoughts, Time time,
                              TofslaVifsla tofslaVifsla, TofslaVifsla.Names names, Start start){
        System.out.println(start.startOfStory());
        System.out.println(names.Tofsla() + " и " + names.Vifsla() + " " + tofslaVifsla.shaking() + ", " + tofslaVifsla.standing() + ", " +
                tofslaVifsla.counting() + ", " + tofslaVifsla.opening() + ", " + tofslaVifsla.talking());
        System.out.println(room + " " + room.shining());
        System.out.println(ruby + " " + ruby.laying() + ", " + ruby.changeable() + ", то " + Characteristics.SVET.description + ", то " +
                Characteristics.PLAMEN.description + ", то " + Characteristics.TULPAN.description);
        System.out.println(otblesk + " " + otblesk.reyal());
        System.out.println(mumitroll + " " + mumitroll.shaking() + ", " + mumitroll.standing() + ", " + mumitroll.talking());
        System.out.println(time + " " + time.wasMade);
        System.out.println(thoughts + " " + thoughts.wasMade);
        thoughts.setEnd(true);

        try {
            if (endStory(thoughts)) {
                System.out.println("The end");
            }
        } catch (IsNotEndException e) {
            e.printErrorMessage();
        }
    }

    public static boolean endStory(Thoughts thoughts) throws IsNotEndException {
        if (thoughts.isEnd()) {
            return true;
        } else {
            throw new IsNotEndException();
        }
    }
}
