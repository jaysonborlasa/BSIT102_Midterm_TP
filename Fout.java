import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Fout {
	
	public static void main(String[] args) throws IOException
	{
		
		System.out.print("Enter the file name with extension : ");
		Scanner jsInput = new Scanner(System.in);
		
		File jsFile = new File(jsInput.nextLine()+".JB");
		jsInput = new Scanner(jsFile);
		
		String jsLine = jsInput.nextLine();
		System.out.println(jsLine);
		
		jsInput.close();
	}
}