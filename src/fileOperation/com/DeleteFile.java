package fileOperation.com;

import java.io.File;
import java.io.IOException;

public class DeleteFile 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\File1.txt");
		boolean b =f.delete();
		
		if(b==true)
		{
			System.out.println("File is deleted succesfully...!");
		}
		else
		{
			System.out.println("File is not deleted....!");
		}
	}

}
