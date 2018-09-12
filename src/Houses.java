import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r= new Robot("june");	
	static int height;
	static String point;
	static String color;
public static void main(String[] args) { 
height=Integer.parseInt(JOptionPane.showInputDialog("How tall do you want your house to be?"));
color=JOptionPane.showInputDialog("What color do you want the house to be?");
point=JOptionPane.showInputDialog("Do you want your houses to have points?");

r.moveTo(50,600);
r.setSpeed(50);
r.penDown();
if (color.equalsIgnoreCase("red")) {
r.setPenColor(255,0,0);
}
if (color.equalsIgnoreCase("green")) {
r.setPenColor(0,255,0);
}
if (color.equalsIgnoreCase("blue")) {
r.setPenColor(0,0,255);
}
if (color.equalsIgnoreCase("purple")) {
r.setPenColor(255,0,255);
}
if (color.equalsIgnoreCase("yellow")) {
r.setPenColor(255,255,0);
}
if (color.equalsIgnoreCase("cyan")) {
r.setPenColor(0,255,255);
}
if (color.equalsIgnoreCase("black")) {
r.setPenColor(0,0,0);
}
if (color.equalsIgnoreCase("white")) {
r.setPenColor(255,255,255);
}
r.setPenWidth(5);
for (int i = 0; i < 10; i++) {
house();
r.setPenColor(0,255,0);
r.move(25);
r.turn(-90);
color();
}

}
static void house () {

	r.move(height);
	if (point.equalsIgnoreCase("no")) {
	r.turn(90);
	r.move(50);
	r.turn(90);
	}else { 
	r.turn(45);
	r.move(25);
	r.turn(90);
	r.move(25);
	r.turn(45);
	}
	r.move(height);
	r.turn(-90);
	r.move(5);
	
	
	
}
static void color() {
	if (color.equalsIgnoreCase("red")) {
		r.setPenColor(255,0,0);
		}
		if (color.equalsIgnoreCase("green")) {
		r.setPenColor(0,255,0);
		}
		if (color.equalsIgnoreCase("blue")) {
		r.setPenColor(0,0,255);
		}
		if (color.equalsIgnoreCase("purple")) {
		r.setPenColor(255,0,255);
		}
		if (color.equalsIgnoreCase("yellow")) {
		r.setPenColor(255,255,0);
		}
		if (color.equalsIgnoreCase("cyan")) {
		r.setPenColor(0,255,255);
		}
		if (color.equalsIgnoreCase("black")) {
		r.setPenColor(0,0,0);
		}
		if (color.equalsIgnoreCase("white")) {
		r.setPenColor(255,255,255);
		}
}
static void pointyHouses() {

}
}
