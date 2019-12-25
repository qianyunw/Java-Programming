import java.io.*;
import java.util.Scanner;


import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
public class Main4 {
	
	public static void main(String[] args)  throws IOException{ 

		Scanner s = new Scanner(System.in);
        System.out.println("Enter your value:");
        String str = s.next();
        File f = new File("d:", "test5.txt");  
        try {  
            f.createNewFile(); // 创建文件  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
        byte b[] = new byte[200];  
        b = str.getBytes();  
        try {  
            FileOutputStream in = new FileOutputStream(f);  
            try {  
                in.write(b); 
                in.close();
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        }  
        try {  
            // 读取文件内容 (输入流)  
            FileInputStream fs = new FileInputStream(f); 
            InputStreamReader fr = new InputStreamReader(fs); 
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while((line = br.readLine()) != null){
            System.out.println(line);
}
            br.close();
            
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
	}
}
