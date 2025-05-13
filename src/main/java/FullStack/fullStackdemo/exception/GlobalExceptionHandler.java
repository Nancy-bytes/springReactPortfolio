package FullStack.fullStackdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    //404 user not found
    @ExceptionHandler(value = {EntityExceptionNotFound.class})
    public ResponseEntity<EntityException> handleUserNotFound(EntityExceptionNotFound entityExceptionNotFound) {
        EntityException entityException = new EntityException(
                entityExceptionNotFound.getMessage(),
                entityExceptionNotFound.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(entityException, HttpStatus.NOT_FOUND);
    }
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<EntityException> handleException(Exception exception) {
//        EntityException userException = new EntityException(
//                "Internal server error",
//                null,
//                HttpStatus.INTERNAL_SERVER_ERROR
//        );
//        return new ResponseEntity<>(userException, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
}
