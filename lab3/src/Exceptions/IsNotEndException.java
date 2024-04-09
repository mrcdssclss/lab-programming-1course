package Exceptions;

public class IsNotEndException extends RuntimeException {

    @Override
    public String getMessage() {
        return "грустно";
    }

    public void printErrorMessage() {
        System.out.println(getMessage());
    }
}