package lab8_1302;
import java.util.ArrayList;
import java.util.Random;
public class Triangle implements Comparable<Triangle>{
	public Point vertexA;
	public Point vertexB;
	public Point vertexC;
	
	
	public Triangle () {
		Random rand = new Random();
		vertexA = new Point(rand.nextInt(10), rand.nextInt(10));
		vertexB = new Point(rand.nextInt(10), rand.nextInt(10));
		vertexC = new Point(rand.nextInt(10), rand.nextInt(10));
	}
	
	public int compareTo(Triangle a) {
		return this.Area()- a.Area();
	}
	
	public int Area() {
		return vertexA.x*(vertexB.y - vertexC.y)+vertexB.x*(vertexC.y-vertexA.y)+vertexC.x*(vertexA.y-vertexB.y);
	}

}
