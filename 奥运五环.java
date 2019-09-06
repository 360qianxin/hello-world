package chapter1;


	import java.applet.Applet;
	import java.awt.BasicStroke;
	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Graphics2D;

	/**
	 * @author caojiantao-ext ???????Í¢
	 */
	public class °ÂÔËÎå»· extends Applet {

	    @Override
	    public void resize(int width, int height) {
	        // TODO Auto-generated method stub
	        super.resize(400, 300);
	    }

	    @Override
	    public void paint(Graphics g) {
	        // TODO Auto-generated method stub
	        super.paint(g);
	        // clr[]?????
	        Color clr[] = { Color.blue, Color.black, Color.red, Color.yellow, Color.green };
	        // x[]?????x????
	        int[] x = { 85, 165, 245, 125, 205 };
	        // y[]?????y????
	        int[] y = { 70, 70, 70, 135, 135 };
	        // ??????????
	        ((Graphics2D) g).setStroke(new BasicStroke(5.0f));
	        for (int loop = 0; loop < clr.length; loop++) {
	            g.setColor(clr[loop]);
	            // ???x,y?????§à??¦Å??????????????90
	            g.drawOval(x[loop], y[loop], 90, 90);
	        }
	    }
	}
