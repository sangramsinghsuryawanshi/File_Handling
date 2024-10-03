/*
 * Q8.
Create a Java program that reads a text file and writes 
its content in reverse order to a new output file.
 */
package fileOperation.com;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReveseFileAndStoreInFile 
{
	public static void isOper()
	{
		try 
		{
			FileWriter fw = new FileWriter("E:\\\\Theroy_Java_Codenera\\\\FileHandling\\\\oper.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("Write here: ");
			fw.write(sc.nextLine());
			System.out.println("Contenet Written..!");
			fw.close();
			sc.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		isOper1();
	}
	public static void isOper1()
	{
		try 
		{
			FileReader fr = new FileReader("E:\\\\Theroy_Java_Codenera\\\\FileHandling\\\\oper.txt");
			Scanner sc = new Scanner(fr);
			StringBuffer sb = new StringBuffer();
			while(sc.hasNextLine())
			{
				sb.append(sc.nextLine());
			}
			System.out.println("Simple order: "+sb);
			System.out.println("reverse order: "+sb.reverse());
			fr.close();
			sc.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		isOper();
	}
}
