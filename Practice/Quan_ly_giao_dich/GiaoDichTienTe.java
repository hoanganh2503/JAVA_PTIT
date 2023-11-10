package Practice.Quan_ly_giao_dich;

public class GiaoDichTienTe extends GiaoDich{
    protected double tigia;
    protected int loaitiente;

    public GiaoDichTienTe(int ma, int sl, String ngay, double dgia, double tgia, int loai){
        super(ma, sl, ngay, dgia);
        this.tigia=tgia;
        this.loaitiente=loai;
    }

    public double getTigia() {
        return tigia;
    }
        
    public void setTigia(double tigia) {
        this.tigia = tigia;
    }
        
    public int getLoaitiente() {
        return loaitiente;
    }
        
    public void setLoaitiente(int loaitiente) {
        this.loaitiente = loaitiente;
    }
        
    public void setThanhien(){
        if(loaitiente==1) this.setThanhtien(this.getDongia()*this.getSoluong());
        else this.setThanhtien(this.getDongia()*this.getSoluong()*this.tigia);
    }

    public String toString(){
        String temp;
        if(loaitiente==1) temp="VND";
        else if(loaitiente==2) temp="USD";
        else temp="EURO";
        return super.toString() + "\t\t" + temp + " = " + tigia + "VND" + "\t\t" + getThanhtien();
    }
}
