package collection.mohit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FilePrac3Serilization implements Serializable	 {
	int id;
	String name;
	String email;
	transient String password;
	public static void main(String[] args) throws Exception {
		FilePrac3Serilization f1 = new FilePrac3Serilization();
		
		f1.id = 100;
	f1.name= "mohit";
	f1.email="mohit@gmail.com";
	f1.password="mohit123";
	
	
	System.out.println("--------Serialization Starts-----------");
	FileOutputStream  fos = new FileOutputStream("Data2.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(f1);
	oos.flush();
	oos.close();
	System.out.println("--------Serialization ends-----------");
	
System.out.println("--------De-Serialization Starts-----------");

FileInputStream fis = new FileInputStream("data2.ser");
ObjectInputStream ois = new ObjectInputStream(fis);

Object obj = ois.readObject();

FilePrac3Serilization f2 = (FilePrac3Serilization)obj;
System.out.println("ID :: "+ f2.id);
System.out.println("Name :: "+ f2.name +"\nEmail :: "+f2.email +"\nPassword ::"+f2.password);

ois.close();

System.out.println("--------De-Serialization ends-----------");
	
	}

}
