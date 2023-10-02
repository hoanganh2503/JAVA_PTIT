public class Functional {
    public String formatName(String s){
        String ans = "";
        String str[] = s.replaceAll("\\s\\s+", " ").trim().toLowerCase().split(" ");
        for(String it:str){
            it = it.substring(0, 1).toUpperCase() + it.substring(1);
            ans += it + " ";
        }
        return ans;
    }

    public String formatDate(String s){
        String str[] = s.split("\\/");
        if(str[0].length() == 1) str[0] = "0" + str[0];
        if(str[1].length() == 1) str[1] = "0" + str[1];
        return str[0] + "/" + str[1] + "/" + str[2];
    }
}
