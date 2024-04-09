package Exceptions;

public class WrongNameException extends Exception {
    public String getMessage() {
        return "неверный формат имени";
    }
}
