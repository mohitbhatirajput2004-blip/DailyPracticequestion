package collection.mohit;

import java.io.FileReader;
import java.io.FileWriter;

public class Fileprac1 {
public static void main(String[] args) throws Exception {

	FileReader fr = new FileReader("data.txt");
	int ch = fr.read();
	while(ch != -1) {
	System.out.print((char)ch);
	
	ch = fr.read();//to read next line
	}
fr.close();
}
}
