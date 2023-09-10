// Cho dãy số A có n phần tử chỉ bao gồm các số nguyên dương (không quá 105).
// Hãy đếm xem mỗi số xuất hiện bao nhiêu lần.      

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Cho_day_so_a_2 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int l = 0;
        while(t-->0){
            l++;
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
            for(Integer it:arr){
                map.put(it, map.getOrDefault(it, 0)+1);
            }
            System.out.println("Test " + l + ":");
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
    
        }
    }
}
