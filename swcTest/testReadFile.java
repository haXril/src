package swcTest;
import java.io.*;

public class testReadFile {

	public static void main(String[] rgs)throws Exception{
		FileReader fr = new FileReader ("Property.txt");
		BufferedReader br = new BufferedReader(fr);
		
		for(int i=0; i <3; i++) {
			String inLine = br.readLine();
			System.out.println(inLine);
		}
		br.close();
	}
}
