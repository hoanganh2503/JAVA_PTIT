// Viết chương trình tính tổng S = 1 + 1.2 + 1.2.3 +   ...+1.2.3...n.  
import java.util.Scanner;

public class Viet_chuong_trinh_tinh_tong {
        public static void main(String[] args){
        long ans = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 1;
        for(int i=2; i<=n; i++){
            s*= i;
            ans += s;
        }
        System.out.println(ans);
    }
}
