import java.util.Scanner;


public class Main3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please input year:");
		int year = s.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Yeah");
		}
		else
			System.out.println("Oh no");
	}
}
