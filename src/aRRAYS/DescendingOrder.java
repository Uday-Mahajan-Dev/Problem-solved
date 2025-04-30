package aRRAYS;
import java.util.Scanner;
import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store 5 integers
        int[] numbers = new int[5];
        
        // Accept 5 integer values from the user
        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Sort the array in descending order
        Arrays.sort(numbers);
        
        // Print the values in descending order
        System.out.println("Values in descending order:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]+ " , ");
        }
        scanner.close();
    }
    
    
}
