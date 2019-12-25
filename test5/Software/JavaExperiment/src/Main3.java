import java.io.*;
import java.util.Scanner;

public class Main3 {
	
	public static void main(String[] args)  throws IOException{ 
        
		Scanner s = new Scanner(System.in);
        double a;
        System.out.println("Enter your value:"); 
        a = s.nextDouble(); 

        System.out.println(Math.cos(a));
	}
}
