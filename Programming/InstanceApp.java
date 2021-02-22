import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("resuly1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("resuly2.txt");
		p2.write("Hello 2");
		p2.close();
		System.out.println(p1.toString());
		p2.toString();
		p2.write("hello 2");
		
//		PrintWrite.write("result1.txt", "Hello 1");
//		PrintWrite.write("result1.txt", "Hello 2");
//		PrintWrite.write("result1.txt", "Hello 1");
//		PrintWrite.write("result1.txt", "Hello 2");
//		PrintWrite.write("result1.txt", "Hello 1");
//		PrintWrite.write("result1.txt", "Hello 2");
//		PrintWrite.write("result1.txt", "Hello 1");
//		PrintWrite.write("result1.txt", "Hello 2");
	}

}
