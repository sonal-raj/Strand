/* Strand.java
 * -------------
 * A stand-alone library to perform Random String operations. The format for usage 
 * and detailed guidelines are mentioned in the manual.txt file.
 *
 * Author: Sonal Raj
 * Use: "import strand"
 */
/*#########################################################################*/
			//CODE IS UNDER GUIDE REVIEW. WILL BE UPDATED SOON.
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
	public static String rand(boolean ASCII)
	{
		Random random = new Random();
		int len  = random.nextInt(1000);
		StringBuilder s = new StringBuilder();
		for(int i = 32;i<=126;i++)
			s.append((char)i);
		char[] alpha = s.toString().toCharArray();

		StringBuilder str = new StringBuilder();
		for(int i = 0; i<len;i++)
			str.append(alpha[random.nextInt(alpha.length)]);
		return str.toString();
	}

	//generate random string of specifoed length, all ASCII
	public static String rand(int len, boolean ASCII)
	{
		Random random = new Random();

		StringBuilder s = new StringBuilder();
		for(int i = 32;i<=126;i++)
			s.append((char)i);
		char[] alpha = s.toString().toCharArray();

		StringBuilder str = new StringBuilder();
		for(int i = 0; i<len;i++)
			str.append(alpha[random.nextInt(alpha.length)]);
		return str.toString();
	}
	//generate random sensible strings
	public static String strand()
	{
		//Adapted from this sentence collection: http://www.cs.columbia.edu/~hgs/audio/harvard.html
		String[] strings= {
				"The birch canoe slid on the smooth planks.",
				"Glue the sheet to the dark blue background.",
				"It's easy to tell the depth of a well.",
				"These days a chicken leg is a rare dish.",
				"Rice is often served in round bowls.",
				"The juice of lemons makes fine punch.",
				"The box was thrown beside the parked truck.",
				"The hogs were fed chopped corn and garbage.",
				"Four hours of steady work faced us.",
				"Large size in stockings is hard to sell.",
				"The small pup gnawed a hole in the sock.",
				"The fish twisted and turned on the bent hook.",
				"Press the pants and sew a button on the vest.",
				"The swan dive was far short of perfect.",
				"The beauty of the view stunned the young boy.",
				"Two blue fish swam in the tank.",
				"Her purse was full of useless trash.",
				"The colt reared and threw the tall rider.",
				"It snowed, rained, and hailed the same morning.",
				"Read verse out loud for pleasure.",
				"We talked of the slide show in the circus.",
				"Use a pencil to write the first draft.",
				"He ran half way to the hardware store.",	
				"The clock struck to mark the third period.",
				"A small creek cut across the field.",
				"Cars and busses stalled in snow drifts.",
				"The set of china hit, the floor with a crash.",
				"This is a grand season for hikes on the road.",
				"The dune rose from the edge of the water.",
				"Those words were the cue for the actor to leave."

		};

		Random rand = new Random();
		int num = rand.nextInt(strings.length);
		return strings[num];
	}

	//generate random string of any length, all Unicode
	//generate random string of specified Length, all Unicode
}
