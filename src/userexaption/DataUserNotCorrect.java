package userexaption;

import java.io.IOException;

public class DataUserNotCorrect extends IOException {
    public DataUserNotCorrect(String message){
        super(message);
    }
}