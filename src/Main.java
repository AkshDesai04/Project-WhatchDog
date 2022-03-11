import java.awt.AWTException;
import java.io.IOException;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class Main implements Runnable {
    public static void main(String[] args) {

        Thread MainThread = new Thread();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH-mm---ss dd-MM-yyyy");
        while(true) {
            try {
                LocalDateTime now = LocalDateTime.now();
                TakeScreenshot.Take_Screenshot(dtf.format(now));
                SmilePlease.Take_Selfie();
                MainThread.sleep(3000);
            }
            catch (InterruptedException E) {
                System.out.println(E);
            }
        }
    }
}
