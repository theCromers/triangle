package lab8_1302;
import java.util.ArrayList;
import java.util.*;
public class client {
	public static void main(String[] args) {
		ArrayList<Triangle> List1 = new ArrayList<Triangle>();
		List1.add(new Triangle());
		List1.add(new Triangle());
		List1.add(new Triangle());
		List1.add(new Triangle());
		List1.add(new Triangle());
		List1.add(new Triangle());
		List1.add(new Triangle());
		List1.add(new Triangle());
		List1.add(new Triangle());
		List1.add(new Triangle());
		System.out.println(List1);
		for(Triangle t: List1) {
			System.out.println(t.Area());
			
		}
		System.out.println();
		Collections.sort(List1);
		for(Triangle t: List1) {
			System.out.println(t.Area());
			
		}
	}
}
