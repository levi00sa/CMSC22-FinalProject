import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CameraSystem extends JPanel{
    private int currentCamFeed = 0;
    private JLabel cameraFeed;

    public CameraSystem(){
        setLayout(new BorderLayout());
        cameraFeed = new JLabel("Camera Feed: Room " + (currentCamFeed),  SwingConstants.CENTER);              //initial camera feed
        add(cameraFeed, BorderLayout.CENTER);

        JButton switchCamera = new JButton("Switch Camera");
        switchCamera.button.addActionListener(e -> SwitchCameraFeed());
        add(switchCamera, BorderLayout.SOUTH);                                                           //where to position the button?
    }
                                                                                                            //logic for switching rooms... 0 -> 1 -> 2 -> 0
    public void SwitchCameraFeed(){
        currentCamFeed = (currentCamFeed + 1) % 3;                                                           //assuming that there are 3 rooms
        cameraFeed = new JLabel("Camera Feed: Room " + (currentCamFeed));
    }
}

