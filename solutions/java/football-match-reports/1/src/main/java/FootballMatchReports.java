public class FootballMatchReports {    
    private static String[] fileds = new String[]{
        "","goalie","left back","center back","center back","right back",
        "midfielder","midfielder","midfielder","left wing","striker","right wing"
    };
    
    public static String onField(int shirtNum) {
        if(shirtNum <= 0 || shirtNum > 11){
            return "invalid";
        }
        return fileds[shirtNum];
    }
}
