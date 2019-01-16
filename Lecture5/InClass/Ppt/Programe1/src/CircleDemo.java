import java.util.*;
class CircleDemo{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle c1 = new Circle();
		c1.radius = 2;
		c1.displayArea();
		Circle c2 = new Circle();
		System.out.print("input radius");

		c2.radius = scan.nextInt();
		c2.displayArea();
	}
}