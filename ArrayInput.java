import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        // Input the size
        int n = sc.nextInt();
        // Create the elements as input
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element number " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}