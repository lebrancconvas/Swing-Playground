package Practice02_DDALine;

import javax.swing.*;
import java.awt.*;
// import java.lang.*;

public class App {
	public static void main(String[] args) {
		Window SwingWindow = new Window();
		SwingWindow.start();
	}
}

class Window extends JPanel {
	public void start() {
		JFrame frame = new JFrame();

		int WIDTH = 800;
		int HEIGHT = 600;

		frame.add(new Window());
		frame.setSize(WIDTH, HEIGHT);
		frame.setTitle("02: Drawing Line.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void paintComponent(Graphics graphic) {
		// Background Setting. 
		// graphic.setColor(Color.BLACK);
		// graphic.fillRect(0, 0, WIDTH, HEIGHT);

		// Line Setting. 
		graphic.setColor(Color.BLACK);
		ddaLine(graphic, 100, 50, 10, 70);
		ddaLine(graphic, 100, 100, 10, 20);
	}

	public void ddaLine(Graphics graphic, int x1, int y1, int x2, int y2) {
		float deltaX = x2 - x1;
		float deltaY = y2 - y1;
		float slope = deltaY / deltaX;
		

		if(slope >= 0 && slope <= 1) {
			for(int i = x1; i <= x2; i++) {
				plot(graphic, i, y1, 1);
				y1 += (int) Math.ceil(slope);
			}
		}
		else if(slope > 1) {
			for(int i = y1; i <= y2; i++) {
				plot(graphic, x1, i, 1);
				y1 += (int) Math.ceil(1 / slope); 
			}
		}
		else if(slope >= -1 && slope <= 0) {
			for(int i = x1; i >= x2; i--) {
				plot(graphic, i, y1, 1);
				y1 += (int) Math.floor(slope); 
			}
		}
		else if(slope < -1) {
			for(int i = y1; i >= y2; i--) {
				plot(graphic, x1, i, 1);
				y1 += (int) Math.floor(1 / slope);  
			}
		}
	}

	public void plot(Graphics graphic, int x, int y, int size) {
		graphic.fillRect(x, y, size, size);
	}
}