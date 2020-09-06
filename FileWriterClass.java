package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

	protected static void dataOut(String out, String data) {
		if (out.isEmpty()) {
			System.out.println(data);
		} else {
			File file = new File(out);
			try (FileWriter writer = new FileWriter(file)) {
				writer.write(data);
			} catch (IOException e) {
				e.getMessage();
			}
		}
	}
}
