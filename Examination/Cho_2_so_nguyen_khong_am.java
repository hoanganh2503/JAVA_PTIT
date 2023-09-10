// Cho hai số nguyên không âm a và b. Hãy tính ab.
// Nếu kết quả quá lớn hãy chia dư cho 10^9 + 7.

import java.util.Scanner;

public class Cho_2_so_nguyen_khong_am {
        public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        long a = 1, b = 1;
        while(true){
            a = sc.nextLong();
            b = sc.nextLong();
            if(a == 0 & b == 0) break;
            System.out.println(Pow(a, b));
        }
        
    }

    static long Pow(long a, long b){
        long mod = (long)(Math.pow(10, 9) + 7);  
        if(b == 0) return 1;
        long x = Pow(a, b/2);   
        if(b%2 == 0) return (x*x)%mod;
        return ((x*x)%mod*a)%mod;
    }
}
