public class SecondAndMinutes {
    public static void main(String[] args){
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));

    }
    public static String getDurationString(int seconds){
        if(seconds>=0){
            int minutes = seconds/60;
            int finalMinutes = seconds%60;
            return getDurationString(minutes, finalMinutes);
        }
        else{
            return "Invalid number";
        }
    }
    public static String getDurationString(int minutes, int seconds){
        if(seconds>=0 && minutes>=0 && seconds<=59){
//            int minutesInSec = minutes*60;
            int totalSec = (minutes*60)+seconds;
            int hour = totalSec/3600;
            int finalMinutes = minutes%60;
            return hour + "h "+finalMinutes +"m "+ seconds +"s";

        }
        else{
            return "Invalid input!, input the values betwee the range of 1-59";
        }


    }
}
