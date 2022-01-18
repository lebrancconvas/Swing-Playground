import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        GraphicsSwing swingWindow = new GraphicsSwing();
        swingWindow.init();
    }
}

class GraphicsSwing extends JPanel {
    public void init() {
        GraphicsSwing window = new GraphicsSwing();
        JFrame frame = new JFrame();
        int width = 800;
        int height = 600;
        frame.add(window);
        frame.setTitle("Java Swing Playground");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


