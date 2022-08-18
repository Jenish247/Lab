/*Create a method named countVowels takes an array of
* characters as input and returns the number of vowels in the array.
* Furthermore, the method should throw a checked exception if the
* array contains the letter 'x'.
*/
package labTest;

public class TestVowel {
	public static int countVowels(char[] CharArr) {
		int count=0;
		for(char ch : CharArr) {
			if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
				count++;
			}
			try {
				if(ch=='x') {
					System.out.println("Checked Exception");
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		char[] str= {'j','e','n','i','s','h'};
		System.out.println("Number of vowels present in array is "+countVowels(str));
	}

}
