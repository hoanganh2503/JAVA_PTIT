import java.util.*;
public class Day_con_co_tong_nguyen_to {
    static Set<String> ans = new TreeSet<>();
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            ans.clear();
            int n = sc.nextInt();
            int arr[] = new int[n+1];
            int a[] = new int[n+1];
            for(int i=1; i<=n; i++) {
                arr[i] = sc.nextInt();
            }
            for(int k = 1; k <= n; k++) {
                for(int i=0; i<=n; i++) {
                    a[i] =i;
                }
                handle1(a, arr, n, k);
            }
            for(String it:ans) System.out.println(it);            
        }

    }

    static void handle1(int[] arr, int a[], int n, int k){
        boolean check = true;
        show1(arr, a,  k);
        while(check){
            int l = k;
            while(arr[l] == n-k+l && l >0) l--;
            if(l > 0){
                arr[l]++;
                for(int j = l+1; j <= k ; j++){
                    arr[j] = arr[j-1]+1;
                }
                show1(arr, a, k);
            }
            else check = false;
        }
    }
    static void show1(int arr[], int a[],  int k) {
        String s = "";
        int sum = 0;
        int temp[] = new int[k+1];
        for(int i = 1 ; i <= k ; i++){
            sum += a[arr[i]];
            temp[i] = a[arr[i]];
        }
        Arrays.sort(temp);
        for(int i = k ; i >=1 ; i--){
            s += temp[i] + " ";
        }
        if(snt(sum)) ans.add(s);
    }
    static boolean snt(int n) {
        if(n < 2) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3 ; i <=Math.sqrt(n) ; i+=2){
            if(n%i == 0) return false;
        }
        return true;
    }
}