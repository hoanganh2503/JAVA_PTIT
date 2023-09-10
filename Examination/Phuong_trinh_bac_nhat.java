// Phương trình bậc nhất là phương trình dạng ax + b = 0.
// Viết chương trình nhập vào hệ số a,b là các số thực và thực hiện giải phương trình bậc nhất.
// Nếu phương trình vô nghiệm thì in ra VN
// Nếu phương trình có vô số nghiệm thì in ra VSN
// Nếu phương trình có nghiệm duy nhất thì in ra với định dạng luôn 2 chữ số thập phân. 

import java.util.Scanner;

public class Phuong_trinh_bac_nhat {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a == 0 && b == 0){
            System.out.println("VSN");
        }
        else if(a == 0 && b != 0){
            System.out.println("VN");
        }else{
            System.out.println(String.format("%.2f", Math.round((-b/a)*100.0)/100.0));
        }
    }
}
