package FullStack.fullStackdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler {
    //404 user not found
    @ExceptionHandler(value = {UserNotFound.class})
    public ResponseEntity<UserException> handleUserNotFound(UserNotFound userNotFound) {
        UserException userException = new UserException(
                userNotFound.getMessage(),
                userNotFound.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(userException, HttpStatus.NOT_FOUND);
    }
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<UserException> handleException(Exception exception) {
//        UserException userException = new UserException(
//                "Internal server error",
//                null,
//                HttpStatus.INTERNAL_SERVER_ERROR
//        );
//        return new ResponseEntity<>(userException, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
}
