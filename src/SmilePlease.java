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
}

// The New changed code below..
import java.awt.Image;
import javax.swing.ImageIcon;
public class Webcam
	extends javax.swing.JFrame implements Runnable {
	public Webcam()
	{
		initComponents();
		lblclose.setText("");
		ImageIcon img = new ImageIcon(
			"C:\\Users\\Meet\\Documents\\JavaProjects\\Watchdog\\src\\images\\sf.png");

		Image myimg = img.getImage();
		Image newimage = myimg.getScaledInstance(
			lblclose.getWidth(), lblclose.getHeight(),
			Image.SCALE_SMOOTH);
		ImageIcon ic = new ImageIcon(newimage);
		lblclose.setIcon(ic);
		new Thread(this).start();
	}
    private void initComponents()
	{

		jPanel1 = new javax.swing.JPanel();
		lblclose = new javax.swing.JLabel();
		lblphoto = new javax.swing.JLabel();
		btnclick = new javax.swing.JButton();

		setDefaultCloseOperation(
			javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		jPanel1.setBackground(
			new java.awt.Color(204, 204, 255));

		lblclose.addMouseListener(
			new java.awt.event.MouseAdapter() {
				public void mouseClicked(
					java.awt.event.MouseEvent evt)
				{
					lblcloseMouseClicked(evt);
				}
			});

		lblphoto.setBorder(
			javax.swing.BorderFactory.createLineBorder(
				new java.awt.Color(0, 0, 0), 4));
    	btnclick.setText("CLICK");

		btnclick.addActionListener(
			new java.awt.event.ActionListener() {
				public void actionPerformed(
					java.awt.event.ActionEvent evt)
				{
					btnclickActionPerformed(evt);
				}
			});

		javax.swing.GroupLayout jPanel1Layout
			= new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout
				.createParallelGroup(javax.swing.GroupLayout
										.Alignment.LEADING)
				.addGroup(
					jPanel1Layout.createSequentialGroup()
						.addGap(51, 51, 51)
						.addComponent(
							lblphoto,
							javax.swing.GroupLayout
								.PREFERRED_SIZE,
							143,
							javax.swing.GroupLayout
								.PREFERRED_SIZE)
						.addPreferredGap(
							javax.swing.LayoutStyle
								.ComponentPlacement.RELATED,
							34, Short.MAX_VALUE)
						.addComponent(
							lblclose,
							javax.swing.GroupLayout
								.PREFERRED_SIZE,
							28,
							javax.swing.GroupLayout
								.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(
					jPanel1Layout.createSequentialGroup()
						.addGap(97, 97, 97)
						.addComponent(btnclick)
						.addContainerGap(
							javax.swing.GroupLayout
								.DEFAULT_SIZE,
							Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout
				.createParallelGroup(javax.swing.GroupLayout
										.Alignment.LEADING)
				.addGroup(
					jPanel1Layout.createSequentialGroup()
						.addGroup(
							jPanel1Layout
								.createParallelGroup(
									javax.swing.GroupLayout
										.Alignment.LEADING)
								.addGroup(
									jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
											lblclose,
											javax.swing
												.GroupLayout
												.PREFERRED_SIZE,
											28,
											javax.swing
												.GroupLayout
												.PREFERRED_SIZE))
								.addGroup(
									jPanel1Layout
										.createSequentialGroup()
										.addGap(22, 22, 22)
										.addComponent(
											lblphoto,
											javax.swing
												.GroupLayout
												.PREFERRED_SIZE,
											143,
											javax.swing
												.GroupLayout
												.PREFERRED_SIZE)))
						.addGap(18, 18, 18)
						.addComponent(btnclick)
						.addContainerGap(29,
										Short.MAX_VALUE)));

		javax.swing.GroupLayout layout
			= new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout
				.createParallelGroup(javax.swing.GroupLayout
										.Alignment.LEADING)
				.addComponent(
					jPanel1,
					javax.swing.GroupLayout.PREFERRED_SIZE,
					javax.swing.GroupLayout.DEFAULT_SIZE,
					javax.swing.GroupLayout
						.PREFERRED_SIZE));
		layout.setVerticalGroup(
			layout
				.createParallelGroup(javax.swing.GroupLayout
										.Alignment.LEADING)
				.addComponent(
					jPanel1,
					javax.swing.GroupLayout.PREFERRED_SIZE,
					javax.swing.GroupLayout.DEFAULT_SIZE,
					javax.swing.GroupLayout
						.PREFERRED_SIZE));

		pack();
		setLocationRelativeTo(null);
	}
    private void
	lblcloseMouseClicked(java.awt.event.MouseEvent evt)
	{
		Boolean flag = false;
		dispose();
	}

	private void
	btnclickActionPerformed(java.awt.event.ActionEvent evt)
	{
		Boolean flag = false;
	}
	public static void main(String args[])
	{
        try {

			for (javax.swing.UIManager
					.LookAndFeelInfo info :
				javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(
						info.getClassName());
					break;
				}
			}
		}
		catch (ClassNotFoundException ex) {
			java.util.logging.Logger
				.getLogger(Webcam.class.getName())
				.log(java.util.logging.Level.SEVERE, null,
					ex);
		}
        catch (InstantiationException ex) {
			java.util.logging.Logger
				.getLogger(Webcam.class.getName())
				.log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		catch (IllegalAccessException ex) {
			java.util.logging.Logger
				.getLogger(Webcam.class.getName())
				.log(java.util.logging.Level.SEVERE, null,
					ex);
        }
		catch (javax.swing
				.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger
				.getLogger(Webcam.class.getName())
				.log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				new Webcam().setVisible(true);
			}
		});
	}
	private javax.swing.JButton btnclick;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel lblclose;
	private javax.swing.JLabel lblphoto;
	Webcam webcam;
	boolean flag = true;
	public void run()
	{
		webcam.getDefault();
		webcam.open();
		while (flag) {
			Image img = webcam.getImage();
			img = img.getScaledInstance(
				lblphoto.getWidth(), lblphoto.getHeight(),
				Image.SCALE_SMOOTH);
			lblphoto.setIcon(new ImageIcon(img));
			try {
				Thread.sleep(20);
			}
			catch (InterruptedException e) {
			}
		}
	}
    // private Image getImage() {
    //     return null;
    // }

    // private void open() {
    // }

    // private Object getDefault() {
    //     return null;
    // }
}
