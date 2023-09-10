// Dãy số Fibonacci được định nghĩa theo công thức như sau:
// F1 = 1
// F2 = 1
// Fn = Fn-1 + Fn-2 với n>2
// Viết chương trình tính số Fibonacci thứ n (với n không quá 92)

import java.util.Scanner;

public class Day_so_FIbonaci_duoc_dinh_nghia {
        public static void main(String[] args){
        long[] fibo = new long[93];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2 ; i <= 92 ; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            int n = sc.nextInt();
            System.out.println(fibo[n]);
        }
    }
}
