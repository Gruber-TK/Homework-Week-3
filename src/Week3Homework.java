 
public class Week3Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
			
//			a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		
			System.out.println(ages[ages.length - 1] - ages[0]);
		
			
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
			
			// added 10 in the middle of ages array and reran code. It gave same output of 90. 
			
			
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			
			int sumAge = 0;
			
			for (int age : ages) {
				sumAge += age; 
			}
			
			System.out.println(sumAge/ages.length);

			
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			
			String[] names = new String [6];
			
			names[0] = "Sam";
			names[1] = "Tommy";
			names[2] = "Tim";
			names[3] = "Sally";
			names[4] = "Buck";
			names[5] = "Bob";

			
			
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			
			int totalNamesLength = 0;
			
			for (String name : names) {
				totalNamesLength += name.length();
			}
			
			System.out.println(totalNamesLength/names.length);

			
			
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.4
			
			String allNames = "";
			
			for (String name : names) {
				allNames += name + " ";
			}
			
			System.out.println(allNames);

			
			
//		3.	How do you access the last element of any array?
			
				// You can access the last element in any array, by calling on the array name and in the square brackets [] input the array length minus 1.
				// For example, in the names array we can call the last element by names[names.length -1]. 
			
			
//		4.	How do you access the first element of any array?
			
				// As the first element of an array is denoted by zero. we can access the first element of an a
				// For example, the first element of our names array would be names[0]
			
		
			
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
			
			int[] nameLengths = new int[6]; 
			
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			}
			
			
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
			
			int sumNameLengths = 0;
			
			for (int num : nameLengths) {
				sumNameLengths += num;
			}
			
			System.out.println(sumNameLengths);
	
			
			//7. 
			String word = "Hello";
			int n = 5;
			
			System.out.println("Test Method 7: " + repeatWord(word, n));
			
			
			
			//8. 
			
			String givenName = "Steve";
			String surName = "Rogers";
			
			System.out.println("Test Method 8: " + createFullName(givenName, surName));
			
			
			//9. 
			
			System.out.println("Test Method 9.1: " + findIfSumIsGreater(ages));
			System.out.println("Test Method 9.2: " + findIfSumIsGreater(nameLengths));
			
			
			
			//10. 
			
			double[] randomNumbers = {1.2, 3.53, 8.0, 6.05};
			
			System.out.println("Test Method 10: " + findAverage(randomNumbers));
			
			
			//11. 
			
			double[] testNumbers = {3.5, 6.8, 9.02, 7.4};
			
			System.out.println("Test Method 11: " + findIsFirstArrayAverageLarger(randomNumbers, testNumbers));
			
			
			//12. 
			
			boolean temp = false;
			double money = 12.53;
			
			System.out.println("Test Method 12: " + willBuyDrink(temp, money));
			
			//13. 
			
			double[] grades = {90.5, 88.0, 66.0, 60.0, 78.5};
			
			System.out.println("Test Method 13: " + isGradeAveragePassing(grades));
			
	}
	
	
	
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
//			(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			
	public static String repeatWord(String word, int n) {
		
		String repeatingWord = "";
		
		for (int i = 0; i < n; i++) {
			repeatingWord += word;
		}
		
		return repeatingWord;
	}
			
			
//		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
//	        (the full name should be the first and the last name as a String separated by a space).
			
	public static String createFullName (String firstName, String lastName) {
		
		String fullName = firstName + " " + lastName;
		
		return fullName; 
	}
	 
	
			
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			
	public static boolean findIfSumIsGreater(int[] array) {
		
		int sumArray = 0; 
		
		for (int num : array) {
			sumArray += num;
		}
		
		return sumArray > 100; 
		
	}
	
	
//		10.	Write a method that takes an array of double and returns the average of all the elements in the array.
			
	public static double findAverage(double[] array) {
		
		double sumArray = 0; 
		
		for (double num : array) {
			sumArray += num;
		}
		
		double average = sumArray/array.length;
		
		return average; 
	}
	
	
			
//		11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			
	public static boolean findIsFirstArrayAverageLarger(double[] x, double[] y) {
		
		double sumFirstArray = 0;
		double sumSecondArray = 0;
		
		for (double num : x) {
			sumFirstArray += num;
		}
		
		for (double num : y) {
			sumSecondArray += num;
		}
		
		double firstAverage = sumFirstArray/x.length;
		double secondAverage = sumSecondArray/y.length; 
		
		return firstAverage > secondAverage;
		
	}
	
			
			
//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			
	public static boolean willBuyDrink(boolean isHotOutSide, double moneyInPocket) {
		
		if (isHotOutSide == true && moneyInPocket > 10.50) {
			return true;
		} return false;
	}
	
	
			
//		13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
	public static String isGradeAveragePassing(double[] grades) {
		
		double passingGrade = 70.0;
		double sumGrade = 0;
		
		for (double grade : grades) {
			sumGrade += grade;
			}
		
		double averageGrade = sumGrade/grades.length;
		
		if (averageGrade >= passingGrade) {
			return "Your grade average is: " + averageGrade + ". Keep up the good work!";
		} else {
			return "Your grade average is: " + averageGrade + ". Better study more.";
		}
		
		
	}
			
			
			
			
			
			
			
			
	
	

}
