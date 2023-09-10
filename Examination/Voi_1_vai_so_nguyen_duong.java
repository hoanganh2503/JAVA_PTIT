// Với một vài số nguyên dương có 1 chữ số, khi cắt đôi số đó theo chiều ngang và lấy nửa phía trên thì ta vẫn có một số nguyên. Cụ thể:
// Số 0 cắt đôi vẫn ra số 0
// Số 1 cắt đôi vẫn ra số 1
// Số 8 cắt đôi ra số 0
// Số 9 cắt đôi ra số 0
// Các số khác cắt đôi sẽ không hợp lệ.
// Cho một số nguyên dương không quá 18 chữ số. Hãy in ra kết quả “cắt đôi” của số đó.
// Nếu không hợp lệ thì ghi ra INVALID. Chú ý: nếu cắt đôi ra một dãy toàn 0 thì cũng được coi là không hợp lệ. Kết quả cắt đôi thì không tính chữ số 0 ở đầu.

import java.util.Scanner;

public class Voi_1_vai_so_nguyen_duong {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            boolean check = false;
            t--;
            String str = sc.nextLine();
            char[] charArray = str.toCharArray();
            for(int i = 0; i < str.length(); i++){
                switch (charArray[i]){
                    case '0':
                        charArray[i] = '0';
                        break;
                    case '1':   
                        charArray[i] = '1';
                        break;
                    case '8':
                        charArray[i] = '0';
                        break;
                    case '9':
                        charArray[i] = '0';
                        break;
                    default:
                        check = true;
                        break;
                }
                if(check) break;
            }
            long ans = Long.parseLong(String.valueOf(charArray));
            if(check || ans == 0){
                System.out.println("INVALID");
            }else{
                System.out.println(ans);
            }

        }        
    }
}
