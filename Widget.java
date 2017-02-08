
public class Widget {

	public static void main(String[] args) {

		nonreptbl("indian");
		swapVariables(45, 4);
		palindromeCheck("madam");

	}

	/**
	 * @param value
	 * check if the given string is a palindrome
	 */
	private static void palindromeCheck(String value) {
		String arr[]=value.split("");
		String farr="", larr="";
		for(int i = 0; i<arr.length;i++){
			farr =farr+arr[i];
		}
        for(int i = arr.length-1; i>=0;i--){
        	larr =larr+arr[i];
		}
    	if(farr.equals(larr)){
    		System.out.println(value+" is a palindrome");
    	}
    	else System.out.println(value+" is not a palindrome");
	}

	/**
	 * @param i
	 * @param j
	 * to swap two variables without using third
	 */
	private static void swapVariables(int i, int j) {
		System.out.println("before swapping.. i : " + i + ", j : " + j);
		System.out.println("after swapping.. i : " + ((i + j) - i) + ", j : "
				+ ((i + j) - j));
	}

	/**
	 * @param string
	 *            Write a program to find the first non repeating letter in a
	 *            word eg : tomato ---> m;  indian --> d
	 */

	private static void nonreptbl(String string) {
		int i = 0;
		while (i < string.length()) {
			String first = "";
			String last = "";
			String pool = "";
			String finalval = "";

			if (i != 0) {

				first = string.substring(0, i);
				last = string.substring(i + 1, string.length());

				pool = first + last;
				String element = String.valueOf(string.charAt(i));
				if (!(pool.contains(element))) {
					finalval = element;
					System.out.println("The first non repeating letter in "+string+" is "+finalval);
					break;
				}

			}
			if (i == 0) {
				last = string.substring(i + 1, string.length());
				pool = last;
				String element = String.valueOf(string.charAt(i));
				if (!(pool.contains(element))) {
					finalval = element;
					System.out.println("The first non repeating letter in "+string+" is "+finalval);
					break;
				}
			}
			i++;
		}
	}
}
