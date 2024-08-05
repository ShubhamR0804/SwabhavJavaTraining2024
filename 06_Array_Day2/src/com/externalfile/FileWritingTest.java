package com.externalfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWritingTest {
	
public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro\\06_Array_Day2\\src\\com\\externalfile\\file1");
	
        int ch;
        
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Aurionpro\\06_Array_Day2\\src\\com\\externalfile\\file2");
        while((ch=fileInputStream.read())!=-1) 
        {
        	
        	fileOutputStream.write(ch);
        	
        }
        System.out.println("File Copied Successfully");
        fileInputStream.close();
        fileOutputStream.close();
	
	}

}
