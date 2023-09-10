// Cho dãy số a[] có n phần tử và dãy số b[] có m phần tử là các số nguyên dương nhỏ hơn 1000. 
// Gọi tập hợp A là tập các số khác nhau trong a[], tập hợp B là tập các số khác nhau trong b[].
// Hãy tìm tập giao của A và B. 
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cho_day_so_a {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            set1.add(a);
        }
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            set2.add(a);
        }
        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);
        int arr[] = new int[intersection.size()];
        int k = 0;
        for(Integer value: intersection){
            arr[k++] = value;
        }
        Arrays.sort(arr);
        for(int it:arr){
            System.out.print(it + " " );
        }
    }
}
