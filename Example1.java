import java.util.Arrays;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = { 1, 1, 1, 1, 5, 5, 5, 10, 11};
        System.out.println(Arrays.binarySearch(arr, 5));      
    }
}