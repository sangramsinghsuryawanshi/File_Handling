package serializationAndDeserialization.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class EmpInfo implements Serializable
{

	private int id;
	private String name;
	transient private String pass;
	private long sal;

	public EmpInfo(int id, String name, String pass, long sal) 
	{
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.sal = sal;
	}
	
	public int getId() 
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public String getPass() 
	{
		return pass;
	}

	public long getSal() 
	{
		return sal;
	}
	@Override
	public String toString() 
	{
		return "EmpInfo [id=" + id + ", name=" + name + ", pass=" + pass + ", sal=" + sal + "]";
	}
}
public class SerializationObjToByte 
{
	public static void main(String[] args) 
	{
		EmpInfo e1 = new EmpInfo(1, "Sangram", "ABC!2", 2000000);
		EmpInfo e2 = new EmpInfo(2, "Harshad", "AB$%2", 3000000);
		File f1 = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\enc.txt");
		try 
		{
			FileOutputStream fo = new FileOutputStream(f1);
			ObjectOutputStream os = new ObjectOutputStream(fo);
			
			os.writeObject(e1);
			os.writeObject(e2);
			os.close();
			fo.close();
			System.out.println("Successful..!");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
