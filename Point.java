package lab8_1302;

public class Point {
	public int x;
	public int y;
	
	public Point() {
		this(0,0);
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
}
