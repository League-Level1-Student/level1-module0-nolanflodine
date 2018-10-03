import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fortune_Cookie implements ActionListener {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Fortune_Cookie fc = new Fortune_Cookie();
		fc.showButton();
		JButton button = new JButton();
		frame.add(button);

	}

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
		System.out.println("Button clicked");
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "The fortune you seek is in another cookie.");
		}else {
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "This cookie is old.");
		}else {
		if (rand == 2) {
			JOptionPane.showMessageDialog(null,
					"You don't have to outrun the bear.  You just have to outrun the person next to you.");
		}else {
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "I have been imprisoned in a Chinese bakery.  Send help!");
		}else {
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You will soon eat a cookie.");
		}
	}
}}}}}
