package FLOWERS;

/*import java.applet.Applet;
import java.awt.*;
public class flower extends java.applet.Applet{
	public void paint(Graphics g) {
super.paint(g);
*/


/*
 * import java.awt.*; import javax.swing.*;
 * 
 * public class flower extends JPanel {
 * 
 * public void paintComponent(Graphics g) { super.paintComponent(g);
 * 
 * // Set flower center coordinates int centerX = getWidth() / 2; int centerY =
 * getHeight() / 2;
 * 
 * // Draw stem g.setColor(Color.GREEN); g.fillRect(centerX - 2, centerY + 20,
 * 4, 50);
 * 
 * // Draw petals (modify these for different shapes) g.setColor(Color.BLUE);
 * for (int i = 0; i < 5; i++) { double angle = Math.PI * 2 * i / 5; int petalX
 * = (int) (centerX + 20 * Math.cos(angle)); int petalY = (int) (centerY + 20 *
 * Math.sin(angle)); g.fillOval(petalX - 10, petalY - 10, 20, 20); }
 * 
 * // Draw center g.setColor(Color.YELLOW); g.fillOval(centerX - 5, centerY - 5,
 * 10, 10); }
 * 
 * public static void main(String[] args) { JFrame frame = new JFrame("Flower");
 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setSize(300,
 * 300); frame.add(new flower()); frame.setVisible(true); } }
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class flower extends JPanel implements ActionListener {

  private double angle = 0; // Rotation angle for petals
  private Timer timer; // Timer for animation

  public flower() {
    timer = new Timer(10, this); // Create timer with 10ms delay
    timer.start(); // Start animation
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Set flower center coordinates
    int centerX = getWidth() / 2;
    int centerY = getHeight() / 2;

    // Draw stem
    g.setColor(Color.GREEN);
    g.fillRect(centerX - 2, centerY + 20, 4, 50);

    // Draw petals with rotation animation
    g.setColor(Color.ORANGE);
    for (int i = 0; i < 5; i++) {
      double rotatedAngle = angle + Math.PI * 2 * i / 5;
      int petalX = (int) (centerX + 20 * Math.cos(rotatedAngle));
      int petalY = (int) (centerY + 20 * Math.sin(rotatedAngle));
      g.fillOval(petalX - 10, petalY - 10, 20, 20);
    }
    angle += 0.01; // Update rotation angle for animation

    // Draw center
    g.setColor(Color.RED);
    g.fillOval(centerX - 5, centerY - 5, 10, 10);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    repaint(); // Trigger repaint on timer tick for animation
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Animated Flower");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.add(new flower());
    frame.setVisible(true);
  }
}	
		

