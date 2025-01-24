package tryCatch;

import java.security.SecureRandom;

public class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}
