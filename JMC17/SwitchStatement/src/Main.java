public class Main {
    public static void main(String[] args) {
        int value = 7;
        Switch(value){
            
//        switch (value) {
//            case 1 -> System.out.println("one");
//            case 2 -> System.out.println("Two");
//            case 3, 4, 5 -> System.out.println("Must be 3,4 or 5");
//            default -> {
//                System.out.println("bad");
//            }
//        }
//        int value = 7;
//        switch (value) {
//            case 1 -> System.out.println("one");
//            case 2 -> System.out.println("Two");
//            case 3, 4, 5 -> System.out.println("Must be 3,4 or 5");
//            default -> System.out.println("bad");
//
//        }
        System.out.println("the month is in "+getQuarter("september"));
    }

    public static String getQuarter(String month){
        return switch(month){
            case "january", "february", "march" -> "First Quarter";
            case "april","may","june" -> "Second Quarter";
            case "july", "august","september" -> "Third Quarter";
            case "october", "november", "december" -> "Fourth Quarter";
            default -> "Invalid";
        };
    }
}
