package fileOperation.com;

import java.io.File;

public class FileSizeByteMGKB 
{
	public static void main(String[] args) 
	{
		File f = new File("C:\\Users\\Shree\\Downloads\\Mix_Question.txt");
		double bytes = f.length();
		double kilobytes=bytes/1024;
		double megabytes=kilobytes/1024;
		 System.out.println("File size in bytes: " + bytes);
         System.out.println("File size in kilobytes: " + kilobytes);
         System.out.println("File size in megabytes: " + megabytes);
	}
}
