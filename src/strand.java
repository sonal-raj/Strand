/* Strand.java
 * -------------
 * A stand-alone library to perform Random String operations. The format for usage 
 * and detailed guidelines are mentioned in the manual.txt file.
 *
 * Author: Sonal Raj
 * Use: "import strand"
 */
/*#########################################################################*/
/*#########################################################################*/
			//CODE IS UNDER GUIDE REVIEW. WILL BE UPDATED SOON.
/*#########################################################################*/
/*#########################################################################*/
import java.util.Random;
//Main controller class for the random String Generator
public class strand
{
	//static char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	//static char[] alphanum = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
	//Global  object of the randon class to be created when theobject of this class
	//is created.
	//generate random string of any length, alphabets only
	public static String rand()
	{
		Random random = new Random();

		//generate a random Length
		int len = random.nextInt();
		char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		StringBuilder str = new StringBuilder();
		for(int i=0;i<len;i++)
			str.append(alpha[random.nextInt(alpha.length)]);
		return str.toString();
	}

	//generate random string of any length, alphabets only, no spaces

	//generate random string of specified length, alphabets only
	public static String rand(int len)
	{
		Random random = new Random();

		//generate a random Length
		char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		StringBuilder str = new StringBuilder();
		for(int i=0;i<len;i++)
			str.append(alpha[random.nextInt(alpha.length)]);
		return str.toString();
	}

	//generate random string of any length, all ASCII
	public static void rand(boolean ASCII)
	{
		Random random = new Random();
		int len  = random.nextInt(1000);
		StringBuilder s = new StringBuilder();
		for(int i = 32;i<=126;i++)
			s.append((char)i);
		char[] alpha = s.toCharArray();

		StringBuilder str = new StringBuilder();
		for(int i = 0; i<len;i++)
			str.append(alpha[random.nextInt(alpha.length)]);
		return str.toString();
	}

	//generate random string of specifoed length, all ASCII
	public static void rand(int len, boolean ASCII)
	{
		Random random = new Random();

		StringBuilder s = new StringBuilder();
		for(int i = 32;i<=126;i++)
			s.append((char)i);
		char[] alpha = s.toCharArray();

		StringBuilder str = new StringBuilder();
		for(int i = 0; i<len;i++)
			str.append(alpha[random.nextInt(alpha.length)]);
		return str.toString();
	}

	//generate random string of any length, all Unicode

	//generate random string of specified Length, all Unicode

	//############# TESTING OF THE PACKAGE ###################
	public static void main(String[] args) {
		System.out.println(rand(5));
		System.out.println(rand(10));
		System.out.println(rand(true));
		System.out.println(rand(40,true));
		System.out.println(rand(100, true));
	}
}
