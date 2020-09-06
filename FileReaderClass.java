package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderClass {

	static String readFile(String name) throws FileNotFoundException {

		File file = new File(name);
		Scanner scanner = new Scanner(new FileReader(file.getAbsolutePath()));
		StringBuilder fileContent = new StringBuilder();

		while (scanner.hasNextLine()) {
			fileContent.append(scanner.nextLine());
		}

		scanner.close();
		return fileContent.toString();
	}

}
