package com.xworkz.inheritance.string;

public class Things {

	public static void main(String[] args) {
		String ride = "Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and"
				+ " featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println(ride.toUpperCase());
		System.out.println(" ");
		System.out.println(ride.toLowerCase());
		System.out.println(" ");

		String[] rides = ride.split(" ");// split by space
		for (int i = 0; i < rides.length; i++) {
			System.out.println(rides[i]);

			System.out.println(" ");

			String[] Ride = ride.split(" ");
			for (int Ridee = 0; Ridee < rides.length; Ridee++) {
				System.out.println(Ride[Ridee]);
			}
			System.out.println(" ");

			char characters[] = ride.toCharArray(); // String is converted to char
			for (int chars = 0; chars < characters.length; chars++) {
				System.out.println(characters[chars]);

			}

			System.out.println(" ");

			String reverse = new StringBuffer(ride).reverse().toString(); // reverse
			System.out.println(reverse);

			System.out.println(" ");

			StringBuffer buffer = new StringBuffer(ride);
			buffer.reverse();
			String palindrome = buffer.toString();
			if (ride.equals(palindrome)) {
				System.out.println(" sentence is palindrome");
			} else {
				System.out.println(" sentence is not a palindrome");
			}

			System.out.println(" ");

			char[] chars = ride.toCharArray();// find number of words
			StringBuilder tin = new StringBuilder();
			for (char j : chars) {
				if (Character.isDigit(j)) {
					tin.append(j);
				}
			}
			System.out.println(tin);
			System.out.println(" ");

		}

		char[] dup = ride.toCharArray(); // to find duplicate numbers
		int count;
		for (int i = 0; i < dup.length; i++) {
			count = 1;
			for (int k = 0; k < dup.length; k++) {
				if (dup[i] == dup[k] && dup[i] != ' ') {
					count++;
					dup[k] = '0';
				}
				if (count > 1 && dup[i] != '0')
					System.out.println("dupicate numbers are =" + dup[k]);

			}

		}
		System.out.println("to find R in sentences");
		String word = "R";
		String repeates[] = ride.split(" ");
		int counts = 0;
		for (int i = 0; i < repeates.length; i++) {
			if (word.equals(repeates[i]))
				counts++;
		}

		System.out.println("The word " + word + " occurs " + counts + " times in the above string");

	}

}