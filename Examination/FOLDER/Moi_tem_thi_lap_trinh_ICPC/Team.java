package Examination.FOLDER.Moi_tem_thi_lap_trinh_ICPC;

public class Team {
    private String ma_team, ten_team, ten_truong;
    
    public Team(String ma_team, String ten_team, String ten_truong){
        this.ma_team = ma_team;
        this.ten_team = ten_team;
        this.ten_truong = ten_truong;
    }

    public String getTeamName() {
        return this.ten_team;
    }
    public String getId() {
        return this.ma_team;
    }

    public String getSchoolName() {
        return this.ten_truong;
    }
}
