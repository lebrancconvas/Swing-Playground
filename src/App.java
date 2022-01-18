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
        graphic.setColor(Color.BLUE);
        graphic.fillRect(0, 0, 800, 600);

        graphic.setColor(Color.WHITE);
        graphic.drawString("Your Program is running.", 80, 100);
        graphic.drawString("This is the graphical program for anyone who want to approve their skill.", 80, 120);
        graphic.drawString("JAVA SWING PLAYGROUND!!", 80, 180);
    }
}


