// Viết chương trình kiểm tra một số nguyên dương có phải số nguyên tố hay không.
// Dòng đầu của dữ liệu vào ghi số bộ test. Mỗi dòng tiếp theo có một nguyên dương không quá 9 chữ số.
//  Kết quả in ra YES nếu đó là số nguyên tố, in ra NO nếu ngược lại.
import java.util.*;

public class Viet_chuong_trinh_kiem_tra_1_so_nguyen_duong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            long n = sc.nextLong();
            if(isPrime(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
