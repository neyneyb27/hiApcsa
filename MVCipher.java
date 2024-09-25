// imports go here

/**
 *	MVCipher - Add your description here
 *	Requires Prompt and FileUtils classes.
 *	
 *	@author	
 *	@since	
 */
public class MVCipher {
	private String keyWord = "";
	private int encryptDecrypt;
	private String encryptFile ="";
	private String encryptFile="";
	// fields go here
		
	/** Constructor */
	public MVCipher() { }
	
	public static void main(String[] args) {
		MVCipher mvc = new MVCipher();
		mvc.run();
	}
	
	/**
	 *	Method header goes here
	 */
	public void run() {
		System.out.println("\n Welcome to the MV Cipher machine!\n");
		
		/* Prompt for a key and change to uppercase
		   Do not let the key contain anything but alpha
		   Use the Prompt class to get user input */
		System.out.println("Please input a word to use as key(letters only");
		keyWord = prompt.getString();
		if(keyWord.length<3){
			System.out.println("ERROR: Key must be all letters and at least"
			 + " 3 characters long");
			System.out.println("Please input a word to use as key(letters" 
			+ " only)");
			keyWord = prompt.getString();
		}
		
		/* Prompt for encrypt or decrypt */
			System.out.println("Encrypt or decrypt? (1,2)");
			encryptDecrypt = prompt.getInt();
			
		/* Prompt for an input file name */
		if(encryptDecrypt ==1){
			System.out.println("Name of file to encrypt");
			encryptFile = in.nextLine();
		}
		else {
			System.out.println("Name of file to decrypt");
			decryptFile = in.nextLine();
		}
		
		
		/* Read input file, encrypt or decrypt, and print to output file */
		Scanner encrypt = FileUtils.openToRead(encryptFile);
		Scanner decrypt = FileUtils.openToRead(decryptFile);
		
		/* Don't forget to close your output file */
	}
	
	// other methods go here
	
}
