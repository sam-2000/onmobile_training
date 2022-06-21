package day4;

import java.io.*;


public class ExceptionIO {

	  // declareing the type of exception
	  public static void findFile() throws IOException {

	    // code that may generate IOException
	    File newFile = new File("test.txt");
	    FileInputStream stream = new FileInputStream(newFile);
	  }

	  public static void main(String[] args) {
	    try {
	      findFile();
	    }
	    catch (IOException e) {
	      System.out.println(e);
	    }
	  }
	}

