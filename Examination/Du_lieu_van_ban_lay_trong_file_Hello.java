// Dữ liệu văn bản chứa trong file Hello.txt
// Yêu cầu đọc nội dung từ file văn bản Hello.txt và in kết quả ra màn hình.

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Du_lieu_van_ban_lay_trong_file_Hello {
    public static void main(String[] args) throws FileNotFoundException{
        File file  = new File("Hello.txt");
        Scanner scanner = new Scanner(file);
        
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println(str);            
        }

    }
}

