import java.util.Scanner;


public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please input n:");
		int n = s.nextInt();
		if(n <= 0) {
			System.out.println("You fooled me");
		}
		else if(n == 1) {
			System.out.println("1");
		}
		else {
			int s1 = 1;
			for(; n > 1; n--) {
				s1 *= n;
			}
			System.out.println(Double.toString(s1));
		}
	}
}
