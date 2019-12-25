import java.util.Scanner;


public class Main4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please input X1:");
		double X1= s.nextDouble();
		System.out.println("Please input Y1:");
		double Y1= s.nextDouble();
		System.out.println("Please input Z:");
		double Z= s.nextDouble();
		System.out.println("Please input angle:");
		double angle= s.nextDouble();
		Line l = new Line(X1, Y1, Z, angle);
		System.out.println("X1:" + Double.toString(l.GetX1()));
		System.out.println("Y1:" + Double.toString(l.GetY1()));
		System.out.println("X2:" + Double.toString(l.GetX2()));
		System.out.println("Y2:" + Double.toString(l.GetY2()));
	}
}
