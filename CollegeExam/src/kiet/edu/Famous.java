package kiet.edu;

//check whether that file exists or not.
//Using the command exists(), isDirectory(), isFile(), getName() and getAbsolutePath().


import java.io.*;

public class Famous {

	public static void main(String[] args) {
		File wr = new File("D:\\KIRAN\\Java-Programs\\abc.txt");
        System.out.println(wr.exists());
        System.out.println(wr.isDirectory());
        System.out.println(wr.isFile());
        System.out.println(wr.getName());
        System.out.println(wr.getAbsolutePath());
	}

}
