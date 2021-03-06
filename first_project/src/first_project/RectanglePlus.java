package first_project;

import java.io.*;
/**
 * <h1> This program implements the interface Relatable!</h1>
 * <p> It has four constructors
 * @author prachi_1
 * @version 1.0
 * @since 2015-10-15
 */
public class RectanglePlus implements Relatable
{
	public int width = 0;
	public int height = 0;
	public Point origin;

		    /**
		     * four constructors
		     */
		    public RectanglePlus() {
		        origin = new Point(0, 0);
		    }
		    public RectanglePlus(Point p) {
		        origin = p;
		    }
		    public RectanglePlus(int w, int h) {
		        origin = new Point(0, 0);
		        width = w;
		        height = h;
		    }
		    public RectanglePlus(Point p, int w, int h) {
		        origin = p;
		        width = w;
		        height = h;
		    }

		    /**
		     *  a method for moving the rectangle
		     * @param x
		     * @param y
		     */
		    public void move(int x, int y) {
		        origin.x = x;
		        origin.y = y;
		    }

		    /**
		     *  a method for computing
		     *   the area of the rectangle
		     * @return
		     */
		    public int getArea() {
		        return width * height;
		    }
		    
		    /**
		     *  a method required to implement
		     *  the Relatable interface
		     */
		     
		    public int isLargerThan(Relatable other) {
		        RectanglePlus otherRect 
		            = (RectanglePlus)other;
		        if (this.getArea() < otherRect.getArea())
		            return -1;
		        else if (this.getArea() > otherRect.getArea())
		            return 1;
		        else
		            return 0;               
		    }
}

