package fileOperation.com;

import java.io.FileWriter;

public class WriteTextInFile 
{
	public static void main(String[] args)
	{
		try 
		{
		FileWriter f = new FileWriter("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\File.txt");
		
			f.write("Content write using FileWriter class");
			System.out.println("Succesfully write content..!");
			f.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Given text is not write..Failed..!");
		}
	}
}
