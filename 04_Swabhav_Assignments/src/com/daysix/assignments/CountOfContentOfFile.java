package com.daysix.assignments;

import java.io.FileInputStream;
import java.io.IOException;

public class CountOfContentOfFile {
	
	public static void main(String[] args) throws IOException {
		
		int character = 0;
		int lines = 0;
		int words = 0;
		int code = 0;
		
		FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro\\04_Swabhav_Assignments\\src\\com\\daysix\\assignments\\myfile1");
		while(fileInputStream.available() != 0) {
			code = fileInputStream.read();
			//ASCII code for newline character is 10 
			if(code!=10) {
				character++;
			}
			//ASCII code for space is 32
			if(code == 32) {
				words++;				
			}
			
			//ASCII code for carriage return is 13
			if(code == 13) {
				words++;
				lines++;
			}
			
			
			
		}
		System.out.println("Number of Characters are : " +character);
		System.out.println("Number of Lines are : " +(lines+1));
		System.out.println("Number of Words are : " +(words+1));
		fileInputStream.close();
	}

}
