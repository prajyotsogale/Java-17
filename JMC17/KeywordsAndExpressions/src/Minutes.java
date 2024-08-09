public class Minutes {
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }else{
            long hour = minutes/60l;
            long days = hour/24l;
            long years = (int)days/365l;
            long daysLeft = (int)days%365;

            System.out.println(minutes+" min = "+years+" y and "+daysLeft+" d");
        }
    }
}
}
