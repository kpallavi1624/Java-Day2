import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i+1) + ": " + numbers[i]);
        }
    }
}