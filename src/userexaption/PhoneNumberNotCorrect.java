package userexaption;

import java.io.IOException;

public class PhoneNumberNotCorrect extends IOException {
    public PhoneNumberNotCorrect(String message) {
        super(message);
    }
}