package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stuff = new String[5];
		//2. print the third element in the array
		System.out.println(stuff[2]);
		//3. set the third element to a different value
		stuff[2]="raspberry";
		//4. print the third element again
		System.out.println(stuff[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < stuff.length; i++) {
			System.out.println(stuff[i]);
		}
		
		//6. make an array of 50 integers
		int[] numbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < numbers.length; i++) {
			Random rand = new Random();
			int x = rand.nextInt(51);
			numbers[i] = x;
		}
		//8. without printing the entire array, print only the smallest number in the array
		int minValue = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
		if(numbers[i]<minValue){
		minValue=numbers[i];	
		}
		}
		System.out.println("The smallest value is " + minValue);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//10. print the largest number in the array.
		int maxValue = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
		if(numbers[i]>maxValue){
		maxValue=numbers[i];	
		}
		}
		System.out.println("The largest value is " + maxValue);
	}
}

