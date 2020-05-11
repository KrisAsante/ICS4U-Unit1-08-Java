/****************************************************************************
 *
 * Created by: Chris Asante
 * Date : April 2020
 * Created for : ICS4U
 * This is a program finds maximum and minimum number in the range of 0-100
 *
 ****************************************************************************/
public class maxmin {

	public static void main(String[] args) {
		int array [] = new int[10];
		
		for(int number = 0; number < array.length;number++) {
			array[number] = (int) (Math.random()*99);
		    System.out.println(array[number]);
		}
		
		max(array[0], array);
		min(array[0], array);
			
   }
	
	public static void max(int maxValue,int[] array) {
		for(int max = 1; max < array.length; max++) {
			if(array[max] > maxValue) {
				maxValue = array[max];
			}	
		
		}
		System.out.println("The max Value is: " + maxValue);
	}
	
	public static void min(int minValue,int[] array) {
		for(int min = 1; min < array.length; min++) {
			if(array[min] < minValue) {
				minValue = array[min];
			}

	    }
		System.out.println("The min Value is: " + minValue);	
	}
	
}