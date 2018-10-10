import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV {
public static void main(String[] args) {
CutenessTV cute= new CutenessTV();
cute.showButton();
JButton button1 =new JButton();
JButton button2 =new JButton();
JButton button3 =new JButton();
JFrame frame = new JFrame();
JPanel panel= new JPanel();
frame.add(panel);
panel.add(button1);
panel.add(button2);
panel.add(button3);
frame.setVisible(true);
frame.pack();
}

void showDucks() {
     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
     try {
          URI uri = new URI(videoID);
          java.awt.Desktop.getDesktop().browse(uri);
     } catch (Exception e) {
          e.printStackTrace();
     }
}
public void showButton() {
    System.out.println("Button clicked");
}
}
