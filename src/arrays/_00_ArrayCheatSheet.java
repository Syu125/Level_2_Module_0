package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	
	public static void main(String[] args) {
		Random random = new Random();
		int  n = random.nextInt(50);
		
		//1. make an array of 5 Strings
		String [] s = new String [5];
		//2. print the third element in the array
		System.out.println(s[3]);
		//3. set the third element to a different value
		s[3]="10";
		//4. print the third element again
		System.out.println(s[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		//6. make an array of 50 integers
		int [] i = new int [50];
		int small = i[0];
		//7. use a for loop to make every value of the integer array a random number
		for(int j = 0; j < i.length; j++) {
			i[j] = n;
			n = random.nextInt(50) + 1;
		}
		//8. without printing the entire array, print only the smallest number in the array
		/*for (int p  =  0; p < i.length;  p++) {
			if(i[p]<small) {
				small = i[p];
			}
		}
		System.out.println(small);*/
		//9 print the entire array to see if step 8 was correct
			/*for (int q = 0; q < i.length; q++) {
				System.out.println(i[q]);
			}*/
		//10. print the largest number in the array.
			for (int k  =  0; k < i.length;  k++) {
				if(i[k]>small) {
					small = i[k];
				}
			}
			System.out.println(small);
	}
}
