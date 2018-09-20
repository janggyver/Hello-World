package askall.ca.javatutorials.io;
import java.io.*;

public class InputDemo {

	public static String numbering(int init, int limit){
		int i = init;
		String output = "";
		while(i < limit){
			output += i;
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(args.length);
		String result = numbering(2, 6);
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		}
		catch(IOException e){
			
		}
	}

}
