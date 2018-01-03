import java.awt.Graphics2D;

public class RecursiveTree {
	private static final double PI = Math.PI;
	private double d, theta;
	private Graphics2D g;
	private int basex, basey, yMax;
	
	public RecursiveTree(int basex, int basey, double d, double theta, Graphics2D g, int middle){
		this.d = d;
		this.theta = theta;
		this.g = g;
		this.basex = basex;
		this.basey = basey;
		this.yMax = 2*middle;
	}
	
	public void draw() {
		recDraw(basex, basey, d, theta);
	}
	
	private void recDraw(int x, int y, double d, double theta){
		int xx = (int) (x+d*Math.cos(theta));
		int xy = (int) (y+d*Math.sin(theta));
		
		if (d>=1) {
			g.drawLine(x, yMax-y, xx, yMax-xy);
		}
	}
}
