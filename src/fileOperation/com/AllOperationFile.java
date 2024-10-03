package fileOperation.com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AllOperationFile 
{
	public static void isCreated()
	{
		File f = new File("E:\\\\\\\\Theroy_Java_Codenera\\\\\\\\FileHandling\\\\\\\\oper.txt");
		boolean b=false;
		try 
		{
			b = f.createNewFile();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		if(b==true)
		{
			System.out.println("File is created succesfully...!");
		}
		else
		{
			System.out.println("File is not created....!");
		}
		System.out.println("-----------------------------------");
	}
	public static void isWrite()
	{
		try 
		{
		FileWriter f = new FileWriter("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\created.txt");
		
			f.write("Given content is created successfully.....!");
			System.out.println("Succesfully write content..!");
			f.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Given text is not write..Failed..!");
		}
		System.out.println("-----------------------------------");
	}
	public static void isRead()
	{
		try 
		{
		FileReader f = new FileReader("E:\\\\\\\\Theroy_Java_Codenera\\\\\\\\FileHandling\\\\\\\\oper.txt");
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
		System.out.println("-----------------------------------");
	}
	public static void isDeleted()
	{
		File f = new File("E:\\\\\\\\Theroy_Java_Codenera\\\\\\\\FileHandling\\\\\\\\oper.txt");
		boolean b =f.delete();
		
		if(b==true)
		{
			System.out.println("File is deleted succesfully...!");
		}
		else
		{
			System.out.println("File is not deleted....!");
		}
		System.out.println("-----------------------------------");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Create File\n2.Write File\n3.Read File\n4.Delete File\n-----------------------\nEnter choice:");
		int ch = -1;
		do
		{
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					isCreated();
					break;
					
				case 2:
					isWrite();
					break;
					
				case 3:
					isRead();
					break;
					
				case 4:
					isDeleted();
					break;
			}
		}while(ch!=0);
	}

}
