import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Tree {
	private JFrame frame;
	private DrawPanel drawPanel;
	private static final int FRAME_WIDTH = 800; //900
	private static final int FRAME_HEIGHT = 700; //800
	private static final float TWOPI = 2.0f * ((float)Math.PI);
	private static final float HALFPI = (float)Math.PI / 2.0f;
	
	private static final int cx = FRAME_WIDTH / 2;
	private static final int cy = (int) (FRAME_HEIGHT * 4.0f / 5.0f);
	
	public Tree(){
		frame = new JFrame("The Rolling-Balls Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new DrawPanel();
		frame.add(drawPanel);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setLocation(0, 0);
	}
	
	class DrawPanel extends JComponent {
		private static final long serialVersionUID = 1L;

		public void paintComponent (Graphics g){
			Graphics2D gl = (Graphics2D) g;
			drawTree(gl);
		}
		
		private void drawTree (Graphics2D g){
			RecursiveTree t = new RecursiveTree(cx, cy, 400, HALFPI, g, cy);
			t.draw();
		}
	}
}

