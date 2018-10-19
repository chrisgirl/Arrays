import java.util.Arrays; 
 /** * Java Program to demonstrate how to reverse an array in place.
  Time complexity of this method is O(n/2) or O(n)
  * swap first element with last element, 
  * swap second element with second last element until you reach the middle of the array. 
  * This way, all elements of array will be reversed without using any additional buffer. 
  * Key thing to keep in mind in this algorithm is that you only need to iterate till middle element, 
  * In that case there will be two middle element and we need to swap them,
  * that's why your loop condition should be index <= middle and not index < middle. 
  * Here middle index is nothing but length/2
  */ 
public class ReverseArray {
  public static void main(String[] args) {
      int[] numbers = {1, 2, 3, 4, 5, 6, 7};
    reverse(numbers);
  } 


 /** * reverse the given array in place * */ 
 public static void reverse(int[] input) { 
 System.out.println("original array : " + Arrays.toString(input));
 
 // handling null, empty and one element array 
 if(input == null || input.length <= 1){
 return;
 }
for (int i = 0; i < input.length / 2; i++) { 
int temp = input[i];
 // swap numbers 
 input[i] = input[input.length - 1 - i]; 
 input[input.length - 1 - i] = temp; 
 } 
System.out.println("reversed array : " + Arrays.toString(input)); 
 
} 
}

