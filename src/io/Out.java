package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Out {
  public Out() throws IOException {
	  OutputStream o = new FileOutputStream("sourcer2.txt");
	  byte[] arr = { 11, 1, 3, 0x01};
	 // System.out.println(arr.length);
	  o.write(arr);
	  o.close();
	  
  }
}
