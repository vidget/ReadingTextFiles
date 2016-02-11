import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// text file with the following stored//
//11
//line one
//line two
//line three

//cat
//fox
//dog
//mouse
//moose
//bird
//fish

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		int x=0;
		//uses an absolute path
		String filename = "C:/Users/Vidiot/Desktop/Programming/testFileToReadIn.txt";
		//    when located in the project folder
		//    String filename = "testFileToReadIn.txt";
		
		File textfile = new File(filename);
				
		Scanner in = new Scanner(textfile);
		
		int numberOfRecords = in.nextInt();
		System.out.println("Number of records: "+numberOfRecords);
		in.nextLine();//need to read the carriage return and new line after
		//reading in initial in in file. 
		
		while(x<numberOfRecords){
			
			String line = in.nextLine();
			System.out.println(line);
			x++;
			
		}
		
		
		in.close();
		
	}

}
