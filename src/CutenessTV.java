import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
    JButton button1 =new JButton();
    JButton button2 =new JButton();
    JButton button3 =new JButton();
    JFrame frame = new JFrame();
    JPanel panel= new JPanel();
public static void main(String[] args) {
CutenessTV cute= new CutenessTV();
cute.showButton();
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
	 button1.setText("Duck song");
	 button2.setText("Frog");
	 button3.setText("Fluffy Unicorns");
	 frame.add(panel);
	 panel.add(button1);
	 panel.add(button2);
	 panel.add(button3);
    frame.setVisible(true);
    frame.pack();
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);   
}


@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource()==button1) {
showDucks();
}
if (e.getSource()==button2) {
showFrog();
}
if (e.getSource()==button3) {
showFluffyUnicorns();
}
}
}
