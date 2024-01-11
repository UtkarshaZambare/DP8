package com.filehandlingdemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteContents {

	FileInputStream fin = null;
	FileOutputStream fout = null;
	BufferedInputStream bin = null;
	BufferedOutputStream bout = null;

	public ReadWriteContents() throws FileNotFoundException {
		File f = new File(".//src//com//filehandlingdemo/Student.java");
		fin = new FileInputStream(f);
		bin = new BufferedInputStream(fin);
		fout = new FileOutputStream("d://newfile1.txt", true);
		bout = new BufferedOutputStream(fout);
	}

	public void writeContents() throws IOException {
		System.out.println("Enter some data..");
		int data = System.in.read();
		// System.out.println(data);
		while (data != 45) {
			bout.write(data);
			bout.flush();
			data = System.in.read();

		}
		System.out.println("contents written to file..");

	}

	public void readContents() throws IOException {

		System.out.println("Contents from file are ..");
		int a = bin.read();
		while (a != -1) {
			System.out.print((char) a);
			a = bin.read();
		}
	}

	public void transferContents(String sourcefile, String destfile) throws IOException {
		fin = new FileInputStream(sourcefile);
		fout = new FileOutputStream(destfile, true);
		int data = fin.read();
		while (data != -1) {
			fout.write(data);
			fout.flush();
			data = fin.read();
		}
		System.out.println("Contentes transfered!");

	}

	public static void main(String[] args) throws IOException {
		ReadWriteContents obj = new ReadWriteContents();
		//obj.writeContents();
		obj.readContents();
		//obj.transferContents(".//src//com//filehandlingdemo/Student.java", "d://newfile1.txt");

	}

}
