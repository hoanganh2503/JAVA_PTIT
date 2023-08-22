import java.util.*;
public class Khoang_cach_nho_hon_k {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){

            int n = sc.nextInt();
            Long k = sc.nextLong();
            Long arr[] = new Long[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }
            System.out.println(handle(arr, n, k));
        }
    }

    static int handle(Long arr[], int n, Long k){
        Arrays.sort(arr);
        int ans = 0;    
        for(int i = 0; i < n; i++){
            Long val = arr[i]+k;
            int y = Arrays.binarySearch(arr, val);
            if(y < 0){  
                y = -(y + 1);
            }
            ans += (y-i-1);
        }
        return ans;
    }
}