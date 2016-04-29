import java.util.Scanner;
public class Decryptor
	{
		static String sentence= Encryptor.sentence;
		static Scanner userInput = new Scanner(System.in);
		public static void decrypt()	
			{
				decryptor();
				}
		public static void decryptor()
			{
				sentence = sentence.replace("25pg", "a").replace("br%^", "e").replace("b@)*%", "i").replace("!@#%", "o").replace("nL9g", "u").replace("+="," ").replace("tyytg", "d");
				System.out.println("Decrypted: " + sentence);
			}
	}
