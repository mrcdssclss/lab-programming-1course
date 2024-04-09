package abstract_;
import java.util.Objects;
import java.util.regex.Pattern;
import Exceptions.WrongNameException;


public abstract class Character extends WrongNameException{
    protected String characterName;
    public void setName(String name) throws WrongNameException{
        characterName = name;

        String regex = "^[a-zA-zа-яА-Я- ]+$";
        if (!Pattern.matches(regex, characterName)){
            throw new WrongNameException();
        }
    }

    public String getName() {
        return characterName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(characterName, character.characterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterName);
    }

    public String toString() {
        return this.getName();
    }
}
