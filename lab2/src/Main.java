import pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon regice = new Regice("Regice", 1);
        Pineco pineco = new Pineco("Pineco", 1);
        Forretress forretress = new Forretress("Forretress", 1);
        Tynamo tynamo = new Tynamo("Tynamo", 1);
        Eelektrik eelectric = new Eelektrik("Eelectric", 1);
        Eelektross eelectross = new Eelektross("Eelectross", 1);
        b.addAlly(regice);
        b.addAlly(pineco);
        b.addAlly(forretress);
        b.addFoe(tynamo);
        b.addFoe(eelectric);
        b.addFoe(eelectross);
        b.go();
    }
}