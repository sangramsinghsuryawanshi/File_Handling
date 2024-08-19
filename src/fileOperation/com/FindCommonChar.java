/*
 *Q.You are given two text files, file1.txt and file2.txt, both of which contain a list of names.
  Your task is to find names that are common to both files and write them to a new file called 
  common_names.txt.
 */
package fileOperation.com;

import java.io.File;

public class FindCommonChar 
{
	public static void isEqaul()
	{
		
	}
	public static void main(String[] args) 
	{
		File f1 = new File("C:\\\\Users\\\\Shree\\\\Desktop\\\\Theroy_Java_Codenera\\\\FileHandling\\\\t1.txt");
		File f2 = new File("C:\\\\Users\\\\Shree\\\\Desktop\\\\Theroy_Java_Codenera\\\\FileHandling\\\\t2.txt");
		try 
		{
			f1.createNewFile();
			f2.createNewFile();
			System.out.println("Done");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
