import java.util.*;
public class Example1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){

            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            // System.out.println(Arrays.binarySearch(arr,1));
            System.out.println(handle(arr, arr.length, k));
        }
    }

    static int handle(int arr[], int n, int k){
        Arrays.sort(arr);
        int ans = 0;    
        for(int i = 0; i < n; i++){
            int val = arr[i]+k;
            int y = Arrays.binarySearch(arr, val);
            if(y < 0){  
                y = -(y + 1);
            }
            ans += (y-i-1);
        }
        return ans;
    }    
}