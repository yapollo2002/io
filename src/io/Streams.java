package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

public class Streams {

	public static void main(String[] args) throws Exception {
		String str0 = "C:\\Users\\One\\eclipse-workspace\\io\\src\\io\\sourcer.txt";
		String str1 = "sourcer.txt";
		String str2 = "sourcer2.txt";
		Scanner c = new Scanner(str1);
		String s = c.nextLine();
		//System.out.print(s);
		
		c.close();
		
		InputStream io = new FileInputStream(new File(str1));
		//InputStream io1 = new FileInputStream(str1);
		

		
		char b =0;
		
		int data = io.read( );
		do/*while(data != -1)*/ {
			b = (char)data;
			//System.out.print(b+" "+data+" ");
             data = io.read();
             //System.out.print(b+" "+data+" ");
		}while(data != -1); 
			
		
		
		io.close();
		
		new Out();
		
		InputStream io2 = new FileInputStream(str2);
		Reader r = new FileReader(str2);
		//System.out.println(r.getClass());
		 b =0;
		 data = io2.read( );
		// System.out.print(b+" "+data+" ");
		do/*while(data != -1)*/ {
			b = (char)data;
			//System.out.print(b+" "+data+" ");
             data = io2.read();
            // System.out.print(b+" "+data+" ");
		}while(data != -1);
		
		
		 b =0;
		 data = r.read( );
		 System.out.print(" "+data+" ");
		do/*while(data != -1)*/ {
			b = (char)data;
			//System.out.print(b+" "+data+" ");
            data = r.read();
            System.out.print(" "+data+" ");
		}while(data != -1);
		io2.close();
		r.close();
		
		
	}

}
