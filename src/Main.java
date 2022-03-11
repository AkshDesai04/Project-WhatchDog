import java.awt.AWTException;
import java.io.IOException;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH-mm-ss dd-MM-yyyy");
        while(true) {
            try {
                LocalDateTime now = LocalDateTime.now();
                TakeScreenshot.Take_Screenshot(dtf.format(now));
                SmilePlease.Take_Selfie();
            }
            catch (Exception E) {
                System.out.println(E);
            }
        }
    }
}
