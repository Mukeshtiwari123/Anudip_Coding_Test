package Ichart_Codes;
import java.util.Scanner;

public class LargestFromEnteredNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Create an array of the specified size
        int[] numbers = new int[size];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Call the method to find the largest element
        int largest = findLargest(numbers);
        
        // Output the largest element
        System.out.println("The largest element is: " + largest);
        
        // Close the scanner
        scanner.close();
    }

    public static int findLargest(int[] array) {
        // Handle the case where the array is empty
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        // Initialize the largest element to the first element of the array
        int largest = array[0];

        // Iterate through the array
        for (int i = 1; i < array.length; i++) {
            // Update the largest element if the current element is larger
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }
}
