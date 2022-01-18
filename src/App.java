import javax.swing.*;
import java.awt.*;

public class App extends JPanel {
    public static void main(String[] args) {
        App m = new App();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Java Swing Playground.");
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}


