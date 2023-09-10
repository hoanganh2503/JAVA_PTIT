// Cho số nguyên dương N có không quá 18 chữ số.
// Hãy đếm xem số chữ số 4 cộng với số chữ số 7 trong N có phải bằng 4 hay bằng 7 hay không.
import java.util.Scanner;

public class Cho_so_nguyen_duong_n1 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        int ans = 0;
        for(int i =  0 ; i< charArray.length ; i++){
            if(charArray[i] == '4' || charArray[i] == '7') ans++;
        }
        if(ans == 4 || ans == 7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
