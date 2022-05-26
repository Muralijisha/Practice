import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Csv {

	public static void main(String[] args) {
		String Filename = "D:\\Automation\\Exercise\\Interview.csv";
		File file = new File(Filename);
	
		try {
			Scanner input = new Scanner(file);
			while(input.hasNext()) {
				String data = input.next();
				System.out.println(data);
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
