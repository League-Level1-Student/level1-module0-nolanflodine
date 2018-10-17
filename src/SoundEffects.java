import javax.swing.JFrame;
import javax.swing.JPanel;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;

import javax.swing.JApplet;
import javax.swing.JButton;
public class SoundEffects {
	JFrame frame= new JFrame();
	JPanel panel=new JPanel();
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	JButton button4=new JButton();
	JButton button5=new JButton();
	String hawk="hawk.wav";
	String explosion="cow.wav";
	String cat="dog.wav";
	String baby="explosion.wav";
	String water="water.wav";
public static void main(String[] args) {
SoundEffects se=new SoundEffects();
}
public void showButton() {
frame.add(panel);
panel.add(button1);
panel.add(button2);
panel.add(button3);
panel.add(button4);
panel.add(button5);
frame.setVisible(true);
frame.pack();
}
private void playSound1(String hawk) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(hawk));
    sound.play();
}
private void playSound2(String explosion) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(explosion));
    sound.play();
}
private void playSound3(String cat) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(cat));
    sound.play();
}
private void playSound4(String baby) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(baby));
    sound.play();
}
private void playSound5(String water) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(water));
    sound.play();
}
public void actionPerformed(ActionEvent e) {
if (e.getSource()==button1) {
}
if (e.getSource()==button2) {
}
if (e.getSource()==button3) {
}
if (e.getSource()==button4) {
}
if (e.getSource()==button5) {
}
}
}
