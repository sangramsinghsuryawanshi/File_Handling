package fileOperation.com;

import java.io.FileReader;
import java.util.Scanner;

public class ReadFile 
{
	public static void main(String[] args)
	{
		try 
		{
		FileReader f = new FileReader("C:\\Users\\Shree\\Desktop\\HTML_Notes\\Html_1.txt");
		Scanner sc = new Scanner(f);
	    StringBuilder l= new StringBuilder();
		while (sc.hasNextLine()) 
		{
           l.append(sc.nextLine());
        }
		
		System.out.println(l.length());
		sc.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Given text is not readable..Failed..!");
		}
	}
}
