package serializationAndDeserialization.com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ByteToObjDeserializable 
{
	public static void main(String[] args) 
	{
		String s = "C:\\\\Users\\\\Shree\\\\Desktop\\\\Theroy_Java_Codenera\\\\FileHandling\\\\enc.txt";
		try 
		{
			FileInputStream f1 = new FileInputStream(s);
			ObjectInputStream f2 = new ObjectInputStream(f1);
			EmpInfo e = (EmpInfo)f2.readObject();
			EmpInfo e3 = (EmpInfo)f2.readObject();
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSal()+" "+e.getPass());
			System.out.println(e3.getId()+" "+e3.getName()+" "+e3.getSal()+" "+e.getPass());
			f1.close();
			f2.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
