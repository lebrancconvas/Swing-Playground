package Practice01_BlueScreen;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        Window SwingWindow = new Window();
        SwingWindow.init();
    }
}

class Window extends JPanel {
    public void init() {
        JFrame frame = new JFrame();

        int width = 800;
        int height = 600;

        frame.add(new Window());
        frame.setTitle("Java Swing Playground");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics graphic) {
        // Background Color.
        graphic.setColor(Color.BLUE);
        graphic.fillRect(0, 0, 800, 600);

        // Text Message.  
        graphic.setColor(Color.WHITE);
        graphic.drawString("This Program is running successfully.", 80, 100);
        graphic.drawString("This is the graphical program for anyone who want to approve their skill.", 80, 120);
        graphic.drawString("JAVA SWING PLAYGROUND!!", 80, 180);
        graphic.drawString("Hope you all enjoy with the program.", 80, 250);

        // Face Sketching. 
        graphic.setColor(Color.PINK);
        graphic.drawOval(350, 400, 100, 100);
        graphic.drawOval(370, 420, 20, 20);
        graphic.drawOval(410, 420, 20, 20);
        graphic.drawLine(390, 460, 410, 480);
        graphic.drawLine(390, 490, 410, 450);
    }
}