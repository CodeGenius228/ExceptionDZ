package userexaption;

import java.io.IOException;

public class DataTimeNotCorrect extends IOException {
    public DataTimeNotCorrect(String message) {
        super(message);
    }
}