/*
 * Q2.Create a Java program that reads a given text file and performs word counting . 
 Consider whitespace and punctuation as word separators.
 */
package fileOperation.com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class WordCountFile 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
		File f = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\File.txt");
		
			Scanner sc = new Scanner(f);
			StringBuilder sb = new StringBuilder();
			while(sc.hasNext())
			{
				sb.append(sc.nextLine());
			}
			int max=0;
			int c=0;
			StringBuilder c1=null; 
			System.out.println(sb);
			for(int i=0;i<sb.length();i++)
			{
				if(sb.length()>max)
				{
					max=sb.length();
					c1=sb;
				}
			}
			System.out.println(c1);
			String s=sb.toString();
			String s1[]=s.split(" ");
			
			//System.out.println("Word count: "+s1.length);
			
			System.out.println(c1);
			sc.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Given text is not write..Failed..!");
		}
	}

}
