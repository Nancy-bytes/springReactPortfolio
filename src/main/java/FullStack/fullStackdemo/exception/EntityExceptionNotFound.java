package FullStack.fullStackdemo.exception;

public class EntityExceptionNotFound extends RuntimeException {
    public EntityExceptionNotFound(String message) {
        super(message);
    }
    public EntityExceptionNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
