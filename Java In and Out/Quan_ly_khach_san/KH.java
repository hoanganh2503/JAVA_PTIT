package Quan_ly_khach_san;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class KH {
    private String ma, ten, phong;
    private double tien, giamGia, giaNgay, phi;
    private long soNgay;

    public KH(String ma, String ten, String phong, String vao, String ra){
        this.ma = ma;
        this.ten = ten;
        this.phong = phong;
        this.soNgay = calculateDay(vao, ra);
        if(this.soNgay < 10) this.giamGia = 0;
        else if(this.soNgay < 20) this.giamGia = 2.00/100.0;
        else if(this.soNgay < 30) this.giamGia = 4.0/100.0;
        else this.giamGia = 6.0/100.0;
    }   

    public void setGiaNgay(double gia) {
        this.giamGia = gia;
    }
    
    public void setPhi(double gia) {
        this.phi = gia;
    }

    public long calculateDay(String vao, String ra){
        try{
            DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateVao = LocalDate.parse(vao, sdf);  
            LocalDate dateRa = LocalDate.parse(ra, sdf);   
            return ChronoUnit.DAYS.between(dateVao, dateRa);       
        }catch(Exception e){
            return 1;
        }

    }
}
