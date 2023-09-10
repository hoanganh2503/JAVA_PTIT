// Cho số tự nhiên N, hãy kiểm tra xem N có phải là số chia hết cho 11 hay không?
// Đưa ra 1 nếu N chia hết cho 11, trái lại đưa ra 0.
import java.util.*;
import java.math.BigInteger;
public class Cho_so_tu_nhien_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            BigInteger k = new BigInteger(sc.next());
            BigInteger v = new BigInteger("11");
            if(String.valueOf(k.mod(v)).equals("0")) System.out.println(1);
            else System.out.println(0);
        }
    }
}
