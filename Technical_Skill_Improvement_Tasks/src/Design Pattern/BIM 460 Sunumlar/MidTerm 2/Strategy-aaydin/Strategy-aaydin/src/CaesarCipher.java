public class  CaesarCipher implements  Encoder {
	    private int offset;
	    public CaesarCipher(int offset) {
        this.offset = offset;
	    }

	    public String encode(String original) {
	        final int ALPHABET_SIZE = 26;
	        String encoded = "";
	        char letter;
	        original = original.toUpperCase();

	        for (int index = 0; index < original.length(); index++) {
	            letter = original.charAt(index);
	            if (letter >= 'A' && letter <= 'Z') {
	                if ((letter + offset) > 'Z')
	                    letter = (char) (letter - ALPHABET_SIZE + offset);
	                else if ((letter + offset) < 'A')
	                    letter = (char) (letter + ALPHABET_SIZE + offset);
	                else
	                    letter = (char) (letter + offset);
	            }
	            encoded = encoded + letter;
	        }

	        return encoded;
	    }

	    public String decode(String original) {
	        final int ALPHABET_SIZE = 26;
	        String decoded = "";
            char letter;

	        original = original.toUpperCase();

	        for (int index = 0; index < original.length(); index++) {
	            letter = original.charAt(index);
	            if (letter >= 'A' && letter <= 'Z') {

	                if ((letter - offset) < 'A')
	                    letter = (char) (letter + ALPHABET_SIZE - offset);
	                else if ((letter - offset) > 'Z')
	                    letter = (char) (letter - ALPHABET_SIZE - offset);
	                else
	                    letter = (char) (letter - offset);
	            }
	            decoded = decoded + letter;
	        }
	        return decoded;
	    }
	}