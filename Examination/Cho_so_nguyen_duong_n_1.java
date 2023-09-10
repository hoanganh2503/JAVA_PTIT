// Cho số nguyên dương N.
// Nhiệm vụ của bạn là hãy xác định xem có bao nhiêu ước số của N chia hết cho 2?

import java.util.Scanner;

public class Cho_so_nguyen_duong_n_1 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            long n = sc.nextLong();
            long m = n;
            long cnt = 0;
            while(m%2==0){
                m/=2;
                cnt++;
            }
            long ans = cnt;
            if(m >= 3) ans += cnt;
            for(long i=3; i<=Math.sqrt(m); i+=2){
                if(m%i==0){
                    ans+=cnt;
                    if(m%(m/i)==0 && m/i != i) ans += cnt;
                }
            }
            System.out.println(ans);
        }
    }
}
