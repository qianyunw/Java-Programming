import java.io.*;
import java.util.Scanner;


import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
public class Main5 {
	
	public static void main(String[] args)  throws IOException{ 

        System.out.println("Aleady exits:");
        File f = new File("d:", "phonesnumber.txt"); 
        try {  
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
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String str = ""; 
        System.out.println("Enter your name and phone number:"); 
        
        String ch = br.readLine();
        while(!ch.equals("exit")) {
        	str += ch;
        	str += "\n";
        	ch = br.readLine();
        }
        try {
		     FileWriter writer = new FileWriter(f, true);
		     writer.write(str);
		     writer.close();
		 } catch (IOException e) {
		     e.printStackTrace();
		 }  

        try {  
            FileInputStream fs = new FileInputStream(f); 
            InputStreamReader fr = new InputStreamReader(fs); 
            br = new BufferedReader(fr);
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
