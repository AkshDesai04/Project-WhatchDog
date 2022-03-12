// import org.bytedeco.javacv.*;
// import org.bytedeco.opencv.opencv_core.IplImage;

// import java.io.File;

// import static org.bytedeco.opencv.global.opencv_core.cvFlip;
// import static org.bytedeco.opencv.helper.opencv_imgcodecs.cvSaveImage;


// public class SmilePlease {
//     public static void Take_Selfie() {

//     }

//     final int INTERVAL = 100;///you may use interval
//     CanvasFrame canvas = new CanvasFrame("Web Cam");

//     public Test() {
//         canvas.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
//     }

//     public void run() {

//         new File("images").mkdir();

//         FrameGrabber grabber = new OpenCVFrameGrabber(0); // 1 for next camera
//         OpenCVFrameConverter.ToIplImage converter = new OpenCVFrameConverter.ToIplImage();
//         IplImage img;
//         int i = 0;
//         try {
//             grabber.start();

//             while (true) {
//                 Frame frame = grabber.grab();

//                 img = converter.convert(frame);

//                 //the grabbed frame will be flipped, re-flip to make it right
//                 cvFlip(img, img, 1);// l-r = 90_degrees_steps_anti_clockwise

//                 //save
//                 cvSaveImage("images" + File.separator + (i++) + "-aa.jpg", img);

//                 canvas.showImage(converter.convert(img));

//                 Thread.sleep(INTERVAL);
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//     public static void main(String[] args) {
//         Test gs = new Test();
//         Thread th = new Thread(gs);
//         th.start();
//     }
// }





// import org.bytedeco.javacv.*;
// import org.bytedeco.opencv.opencv_core.IplImage;

// import java.io.File;

// import static org.bytedeco.opencv.global.opencv_core.cvFlip;
// import static org.bytedeco.opencv.helper.opencv_imgcodecs.cvSaveImage;


public class SmilePlease {
    public static void Take_Selfie() {

    }

    // final int INTERVAL = 100;///you may use interval
    // CanvasFrame canvas = new CanvasFrame("Web Cam");

    // public Test() {
    //     canvas.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    // }

    // public void run() {

    //     new File("images").mkdir();

    //     FrameGrabber grabber = new OpenCVFrameGrabber(0); // 1 for next camera
    //     OpenCVFrameConverter.ToIplImage converter = new OpenCVFrameConverter.ToIplImage();
    //     IplImage img;
    //     int i = 0;
    //     try {
    //         grabber.start();

    //         while (true) {
    //             Frame frame = grabber.grab();

    //             img = converter.convert(frame);

    //             //the grabbed frame will be flipped, re-flip to make it right
    //             cvFlip(img, img, 1);// l-r = 90_degrees_steps_anti_clockwise

    //             //save
    //             cvSaveImage("images" + File.separator + (i++) + "-aa.jpg", img);

    //             canvas.showImage(converter.convert(img));

    //             Thread.sleep(INTERVAL);
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }

    // public static void main(String[] args) {
    //     Test gs = new Test();
    //     Thread th = new Thread(gs);
    //     th.start();
    // }
//}
    
    import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class SmilePlease {

	public static void main(String[] args) throws IOException {

		// get default webcam and open it
		Webcam webcam = Webcam.getDefault();
		webcam.open();

		// save image to PNG file
		ImageIO.write(webcam.getImage(), "JPG", new File("smile.jpg"));
	}
    public boolean open(){
        return open(false);
    }
    private boolean open(boolean b) {
        return false;
    }
    private Webcam openWebcam(Webcam webcam, Dimension dimension) 
    {
        if (webcam.open() && isStarted() && !dimension.equals(webcam.getViewSize())) {
          webcam.close();
        } 
        
        if (!webcam.open() && dimension != null) {
          webcam.setCustomViewSizes(new Dimension[]{dimension});
          webcam.setViewSize(dimension);
          webcam.open(true);
        } else if (!webcam.open()) {
          webcam.open(true);
        }
        return webcam;
    }
    public class Dimension{
        Dimension size = Toolkit.getDefaultToolkit.getViewSize();
    }
}
