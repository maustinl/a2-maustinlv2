package a2;

import java.util.Scanner;

public class A2Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Your code here.

		int numberOfItems = scan.nextInt();

		// These are 4 arrays to store the inputs of the scanner

		String[] Ingredient_Name = new String[numberOfItems];

		double[] Price_Per_Ounce = new double[numberOfItems];

		boolean[] Is_Vegetarian = new boolean[numberOfItems];

		int[] Calories_Per_Ounce = new int[numberOfItems];


		// A loop to place inputs from the scanner into the arrays

		for (int i=0; i < numberOfItems; i++) {

			Ingredient_Name[i] = scan.next();

			Price_Per_Ounce[i] = scan.nextDouble();

			boolean vegetarian = scan.nextBoolean();

			Calories_Per_Ounce[i] = scan.nextInt();


			// Ingredient_Name[i] += ingredient;

			// Price_Per_Ounce[i] += price;

			if (vegetarian) Is_Vegetarian[i] = true;
			else Is_Vegetarian[i] = false;

			// Calories_Per_Ounce[i] += calories;

		}

		// The first line of our output

		int vegetarianCounter = 0;

		for (int i=0; i < numberOfItems; i++) {

			if(Is_Vegetarian[i]) {
				vegetarianCounter++;
			}

		}

		System.out.println("Number of vegetarian ingredients: " + vegetarianCounter);




		double[] caloriesPerDollar = new double[numberOfItems];

		for (int i=0; i < numberOfItems; i++) {

			caloriesPerDollar[i] += ((double) Calories_Per_Ounce[i] / Price_Per_Ounce[i]);

		}

		int highestCaloriesPerDollar = maxValueIndex(caloriesPerDollar);


		System.out.println("Highest cals/$: " + Ingredient_Name[highestCaloriesPerDollar]);

		System.out.println("Lowest cals/$: " + Ingredient_Name[minValueIndex(caloriesPerDollar)]);

	}
	
	// You can define helper methods here if needed.

	public static int maxValueIndex(double[] tmp) {

		double max = 0;

		int maxIndex = 0;

		for (int i=0; i < tmp.length; i++) {

			if (max < tmp[i]) {

				max = tmp[i];
				maxIndex = i;

			}

		}

		return maxIndex;

	}

	public static int minValueIndex(double[] tmp) {

		double min = 0;

		int minIndex = 0;

		for (int i=0; i < tmp.length; i++) {

			if (i==0) {
				min = tmp[0];
			}

			if (min > tmp[i]) {

				min = tmp[i];
				minIndex = i;

			}

		}

		return minIndex;

	}



}
