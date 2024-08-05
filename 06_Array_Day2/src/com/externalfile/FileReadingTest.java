package com.externalfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro\\06_Array_Day2\\src\\com\\externalfile\\file1");
	
        int ch;
        while((ch=fileInputStream.read())!=-1) {
        	
        	System.out.print((char)ch);
        	
        }
        fileInputStream.close();
	
	}
	
	

}
