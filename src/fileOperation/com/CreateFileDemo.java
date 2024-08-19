package fileOperation.com;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\File.txt");
		boolean b =f.createNewFile();
		System.out.println(""+f.canRead());
		System.out.println(""+f.canWrite());
		if(b==true)
		{
			System.out.println("File is created succesfully...!");
		}
		else
		{
			System.out.println("File is not created....!");
		}
	}

}
