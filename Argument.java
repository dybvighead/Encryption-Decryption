package encryptdecrypt;

import java.io.IOException;

public class Argument {

	String mode = "enc";
	int key = 0;
	String data = "";
	String in = "";
	String dataIn = "";
	String out = "";
	String alg = "shift";

	protected Argument(String[] args) {
		for (int i = 0; i < args.length; i++) {
			switch (args[i]) {
			case "-mode":
				mode = args[i + 1];
				break;
			case "-key":
				key = Integer.parseInt(args[i + 1]);
				break;
			case "-data":
				data = args[i + 1];
				break;
			case "-in":
				in = args[i + 1];
				break;
			case "-out":
				out = args[i + 1];
				break;
			case "-alg":
				alg = args[i + 1];
				break;
			}
		}
		dataOrIn();
	}

	private void dataOrIn() {
		if (data.isEmpty()) {
			try {
				dataIn = FileReaderClass.readFile(in);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			dataIn = data;
		}
	}

}
