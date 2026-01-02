package collection.mohit;

import java.io.FileReader;
import java.io.BufferedReader;

public class Fileprac2 {
public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("data.txt");
	BufferedReader br = new BufferedReader(fr);
	
	String content =br.readLine();
	
	while(content != null) {
		System.out.println(content);
		content =br.readLine();
	}
	br.close();
	fr.close();
}
}
