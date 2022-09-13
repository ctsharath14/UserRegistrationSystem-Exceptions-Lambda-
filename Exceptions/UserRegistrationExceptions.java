package Exceptions;

public class UserRegistrationExceptions extends Exception {

    public ExceptionType exceptionType;
    public String message;
    public enum ExceptionType {
        EMPTY, INVALID;
    }

    public UserRegistrationExceptions(String message) {
        super();
        this.message = message;
    }

    public UserRegistrationExceptions(ExceptionType exceptionType, String message) {
        this.exceptionType = exceptionType;
        this.message = message;
    }

    @Override
    public String toString() {
        return "UserRegistrationExceptions {" + "ExceptionType= " + exceptionType + ", Message='" + message + '\'' + '}';
    }

}
