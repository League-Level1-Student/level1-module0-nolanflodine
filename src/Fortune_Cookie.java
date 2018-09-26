import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fortune_Cookie implements ActionListener {
public static void main(String[] args) {
Fortune_Cookie fc=new Fortune_Cookie();
fc.showButton();


}
 public void showButton() {
	 JFrame frame=new JFrame();
	 frame.setVisible(true);
	 JButton button = new JButton();
	 frame.add(button); 
	 button.addActionListener(this);
    System.out.println("Button clicked");
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
