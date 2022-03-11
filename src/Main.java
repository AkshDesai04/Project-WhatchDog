import java.awt.AWTException;
import java.io.IOException;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH-mm---ss dd-MM-yyyy");
        while(true) {
            try {
                LocalDateTime now = LocalDateTime.now();
                TakeScreenshot.Take_Screenshot(dtf.format(now));
                SmilePlease.Take_Selfie();
                Thread.sleep(3000);
            }
            catch (InterruptedException E) {
                System.out.println(E);
            }
        }
    }
}
