import java.util.Scanner;

interface Calculate{
	int Add(int a, int b);  
	int Sub(int a, int b);  
	int Mul(int a, int b);  
	int Div(int a, int b);  
}
	
public class Main1 implements Calculate{
	
	public int Add(int a, int b)  {  
        return (a+b);
    }  
	public int Sub(int a, int b)  {  
        return (a-b);
    }  
	public int Mul(int a, int b)  {  
        return (a*b);
    }  
	public int Div(int a, int b)  {  
		int z = -1;
		try {
			z = a/b;
		}catch(java.lang.Exception e) {
			System.out.println("I can't saitisfy you.");
		}
        return z;
    }  
	
	public static void main(String[] args) {
		
		Main1 A = new Main1();
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a and b:");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Please enter + | - | * | / :");
		String c = s.next();
		switch(c) {
		case "+":
			System.out.println(A.Add(a,b));
			break;
		case "-":
			System.out.println(A.Sub(a,b));
			break;
		case "*":
			System.out.println(A.Mul(a,b));
			break;
		case "/":
			System.out.println(A.Div(a,b));
			break;
		default:
			break;
		}
		System.out.println("Max:");
		System.out.println(Math.max(a, b));
		System.out.println("Abs:");
		System.out.println(Math.abs(a-b));
		
	}
}
