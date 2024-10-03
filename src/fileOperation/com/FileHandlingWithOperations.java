/*
 * Q5. Wap create a file and add any sentence in it,
   now from that file , find out :
   
       1)no of words started with vowel
       2)frequency of charcater
       3)most repeated words
 */
package fileOperation.com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandlingWithOperations
{
	public static void isCreated()
	{
		File f = new File("E:\\Theroy_Java_Codenera\\FileHandling\\oper1.txt");
		boolean b =false;
		try
		{
			b=f.createNewFile();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		if(b==true)
		{
			System.out.println("File is Created");
		}
		else
		{
			System.out.println("File is not Created..!");
		}
	}
	public static void isWrite()
	{
		try 
		{
			FileWriter fw = new FileWriter("E:\\Theroy_Java_Codenera\\FileHandling\\oper.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("Write Content here: ");
			fw.write(sc.nextLine());
			System.out.println("Conten written Successfully.!");
			fw.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	public static void isRead()
	{
		try 
		{
			FileReader fr = new FileReader("E:\\Theroy_Java_Codenera\\FileHandling\\oper.txt");
			Scanner sc = new Scanner(fr);
			StringBuffer sb = new StringBuffer();
			while(sc.hasNextLine())
			{
				sb.append(sc.nextLine());
			}
			StringBuffer vo = new StringBuffer();
			String s2[]=sb.toString().split(" ");
			System.out.println("Number of words started with vowel");
			for(int i=0;i<s2.length;i++)
			{
				if(s2[i].length()>0) 
				{
			        char firstChar = Character.toLowerCase(s2[i].charAt(0)); 
			        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') 
			        {
			            vo.append(s2[i]).append(" ");
			        }
			    }
			}
			System.out.println(vo);
			char ch[]=sb.toString().toCharArray();
			System.out.println("Given Frequency of character: ");
			for(int i=0;i<ch.length;i++)
			{
				int cnt=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						cnt++;
						ch[j]='0';
					}
				}
				if(ch[i]!='0' && ch[i]!=' ')
				{
					System.out.println(ch[i]+" "+cnt);
				}
			}
			String s[]=sb.toString().split(" ");
			int max=Integer.MIN_VALUE;
			String s1="";
			System.out.println("Given Frequency of word: ");
			for(int i=0;i<s.length;i++)
			{
				int cnt=1;
				for(int j=i+1;j<s.length;j++)
				{
					if(s[i]==s[j])
					{
						cnt++;
						s[j]="null";
					}
				}
				if(s[i]!="null" && cnt>max && s[i]!=" ")
				{
					max=cnt;
					s1=s[i];
				}
			}
			System.out.println(s1+" "+max);
			fr.close();
			sc.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	public static void isDel()
	{
		File f= new File("E:\\Theroy_Java_Codenera\\FileHandling\\oper1.txt");
		boolean b = false;
		b=f.delete();
		if(b==true)
		{
			System.out.println("Given file is deleted.");
		}
		else
		{
			System.out.println("Not deleted..");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Create File\n2.Write File\n3.Read File\n4.Enter 0 for Terminate\n-----------------------\nEnter choice:");
		int ch=-1;
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
					isDel();
					break;
					
				default :
					System.out.println("Invalid Input..!");
					break;
			}
		}while(ch!=0);
	}
}
