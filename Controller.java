package encryptdecrypt;

public class Controller {

	Argument arg;
	Encryption enc;
	Decryption dec;
	String result;

	public Controller(String[] args) {
		arg = new Argument(args);
		enc = new Encryption();
		dec = new Decryption();
	}

	public void encryptDecrypt() {
		if (arg.mode.equalsIgnoreCase("enc")) {
			switch (arg.alg.toLowerCase()) {
			case "unicode":
				result = enc.unicode(arg.dataIn, arg.key);
				break;
			case "shift":
				result = enc.shift(arg.dataIn, arg.key);
				break;
			}
		} else {
			switch (arg.alg.toLowerCase()) {
			case "unicode":
				result = dec.unicode(arg.dataIn, arg.key);
				break;
			case "shift":
				result = dec.shift(arg.dataIn, arg.key);
				break;
			}
		}
		FileWriterClass.dataOut(arg.out, result);
	}
}
