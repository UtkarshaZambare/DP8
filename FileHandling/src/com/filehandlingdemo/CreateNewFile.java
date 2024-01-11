package com.filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		File folder = new File("D://FileHandling");
		System.out.println(folder.mkdir());
		
		File file1 = new File("D://FileHandling//filehandlingdemo");
		System.out.println(file1.createNewFile());
		
		

	}

}
