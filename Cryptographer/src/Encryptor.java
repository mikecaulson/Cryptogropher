import java.util.Scanner;
public class Encryptor
	{
		static int originalText = 0;
		static String sentence;
		static Scanner userInput = new Scanner(System.in);
		static String strip;

		public static void encrypt()
			{
				crypt();
				space();
				vowels();
			}

		public static void crypt()
			{
				System.out.println("I will encrypt a sentence for you into my personal code, type me a phrase.");
			}

		public static String space()
			{
				sentence = userInput.nextLine();
				sentence = sentence.replace(" ", "+=");
				

				return sentence;
			}

		public static void vowels()
			{
				sentence = sentence.replace("a", "25pg").replace("e", "br%^").replace("i", "b@)*%").replace("o", "!@#%").replace("u", "nL9g").replace("d", "tyytg");
				System.out.println("Code: " + sentence);
			}
	}