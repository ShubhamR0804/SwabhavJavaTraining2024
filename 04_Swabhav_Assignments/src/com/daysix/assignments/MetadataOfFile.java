package com.daysix.assignments;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;


public class MetadataOfFile {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Aurionpro\\04_Swabhav_Assignments\\src\\com\\daysix\\assignments\\myfile1");
		Path path = file.toPath();
		BasicFileAttributes fileAttr = Files.readAttributes(path, BasicFileAttributes.class);
		
		
			System.out.println("Name : " +file.getName());
			System.out.println("Location : "+file.getAbsolutePath());
			System.out.println("Size : "+file.length());
			System.out.println("Created : "+ fileAttr.creationTime());
			System.out.println("Last Modified : "+ fileAttr.lastModifiedTime());
			System.out.println("Last Access : "+ fileAttr.lastAccessTime());
			System.out.println("Readable : "+ file.canRead());
			System.out.println("Writable : "+ file.canWrite());
		
	}

}
