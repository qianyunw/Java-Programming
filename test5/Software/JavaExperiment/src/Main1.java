import java.util.Scanner;
public class Main1 {
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your two strings:");
		String a = s.nextLine();
		String b = s.nextLine();
		int c = -1;
		int d = -1;
		
		try{
			c = Integer.valueOf(a);
		}catch(java.lang.NumberFormatException e) {
			System.out.println(":Error 1");
		}
		try{
			d = Integer.valueOf(b);
		}catch(java.lang.NumberFormatException e) {
			System.out.println(":Error 2");
		}
		System.out.println("1:" + c);
		System.out.println("2:" + d);
	}
}
