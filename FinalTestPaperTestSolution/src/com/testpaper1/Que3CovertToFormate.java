/*Covert password to string ->[1M]
password is India'sAge72@2019
convert to UllllSlUllNNSNNNN -> U= Uppercase, l= lowercase, S=
Specialcase, N= Number
shorten above to ->U4lSlU2l2NS4N
*/

package com.testpaper1;

public class Que3CovertToFormate {

	public static String convertToFormat(String password) {
		String convertedPassword = "";
		for (char c : password.toCharArray()) {
			if (Character.isUpperCase(c)) {
				convertedPassword += "U";
			} else if (Character.isLowerCase(c)) {
				convertedPassword += "l";
			} else if (Character.isDigit(c)) {
				convertedPassword += "N";
			} else {
				convertedPassword += "S";
			}
		}
		return convertedPassword;
	}

	public static String shortenString(String convertedPassword) {
		String ss = "";
		int count = 0;
		char ch = 0;
		for (char c : convertedPassword.toCharArray()) {
			if (c == ch) {
				count++;
			} else {
				if (count > 0) {
					ss += ch + String.valueOf(count);
				}
				ch = c;
				count = 1;
			}
		}

		// Add the last character and its count to the shortened string
		ss += ch + String.valueOf(count);

		// Return the final shortened string
		return ss;
	}

	public static void main(String[] args) {
		String password = "India'sAge72@2019";
		String convertedPassword = convertToFormat(password);
		System.out.println("Converted Password: " + convertedPassword);
		String ss = shortenString(convertedPassword);
		System.out.println("Shorten String: " + ss);
	}

}
