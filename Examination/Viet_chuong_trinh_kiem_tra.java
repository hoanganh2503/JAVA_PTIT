// Viết chương trình kiểm tra số nguyên dương N có thỏa mãn tính chất: 
// tất cả các chữ số cạnh nhau chỉ sai khác nhau đúng một đơn vị hay không. 
// Ví dụ: số 123212 là số thỏa mãn, số 34578 không thỏa mãn.

import java.util.Scanner;

public class Viet_chuong_trinh_kiem_tra {
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            t--;
            String str = sc.nextLine();
            if(checkStr(str)) System.out.println("YES");
            else System.out.println("NO");
        }
   }

   static boolean checkStr(String str){
        char[] charArray = str.toCharArray();
        for(int i=1; i<charArray.length-1; i++){
            if(Math.abs(charArray[i] - charArray[i+1]) != 1 || Math.abs(charArray[i] - charArray[i-1]) != 1) return false;
        }
        return true;
   }
}
