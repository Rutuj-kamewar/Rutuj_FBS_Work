package p2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class que1 {
public static void main(String[] args) throws IOException {
//	FileWriter fw = new FileWriter("Demo1.txt");
//	BufferedWriter bw = new BufferedWriter(fw);
//	bw.write("HEllo");
//	bw.newLine();
//	bw.write("rutuj");
//	bw.newLine();
//	bw.write("You are Robot");
//	bw.close(); 
	
	FileReader fr = new FileReader("Demo1.txt");
	BufferedReader br = new BufferedReader(fr);
	
	String str;
//	str = br.readLine();
//	String[] res = str.split(",");
//	for(int i=0; i<res.length; i++)
//		System.out.print(res[i]);
	
	System.out.println();
	while((str = br.readLine())!= null)
		{
		String[] res2 = str.split(",");
		for(int i=0; i<res2.length; i++)
			System.out.print(res2[i] + " ");
		
		System.out.println();
		}
		
	
	
	
}
}
