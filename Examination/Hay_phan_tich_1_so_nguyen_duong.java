// Hãy phân tích một số nguyên dương thành tích các thừa số nguyên tố.   

import java.util.Scanner;

public class Hay_phan_tich_1_so_nguyen_duong {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 0;
        while(t>0){
            k++;
            t--;
            long n = sc.nextLong();
            System.out.print("Test " + k + ": ");
            for(int i = 2 ; i<=n ; i++){
                int dem = 0;
                while(n%i == 0){
                    dem++;
                    n /= i;
                }
                if(dem > 0){
                    System.out.print(i + "(" + dem + ") ");
                }
            }
            System.out.println();

        }
    }
}
