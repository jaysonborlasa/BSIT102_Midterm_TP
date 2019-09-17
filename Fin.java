import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Fin
{
	public static void main(String[] args) throws IOException
	{
	
		Scanner js = new Scanner(System.in);
		String FileText;
		String jsText;
		
		System.out.println("Input File Name");
		FileText = js.nextLine();
		System.out.println("Input File Name");
		jsText = js.nextLine();
		
		//Creates New File
		FileWriter jsFile = new FileWriter(jsText+ ".JB");
		jsFile.write(FileText);
		jsFile.close();
	}
}



