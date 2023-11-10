package Quan_ly_khach_san;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("D:/MONHOC.in"));
        int n = sc.nextInt();
        Phong p[] = new Phong[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            p[i] = new Phong(sc.next().trim(), sc.next().trim(), sc.nextDouble(), sc.nextDouble());
        }

        int
    }
}
