// Xâu con của một xâu ký tự S được tạo ra bằng cách lấy một hoặc nhiều ký tự trong S và giữ nguyên thứ tự ban đầu.
// Cho xâu S chỉ bao gồm các chữ cái viết thường. Hãy in ra xâu con có thứ tự từ điển là lớn nhất.
import java.util.Scanner;

public class Xau_con_cua_1_xau_ki_tu {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int j = 0, i;
        while(j<s.length()){
            char max = s.charAt(j);
            for( i = j ; i < s.length() ; i++){
                if(s.charAt(i) > max){
                    max = s.charAt(i);
                    j = i;
                }
            }

            for( i = j ; i < s.length() ; i++){
                if(s.charAt(i) == max){
                    System.out.print(s.charAt(i));
                    j = i + 1;
                }
            }            
        }


    }
}
