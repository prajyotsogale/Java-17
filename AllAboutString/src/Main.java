public class Main {
    public static void main(String[] args) {
        //stringInform("helloworld");
        //stringInform("");
        //stringInform("   ");
        String h = "Hello World";
        System.out.printf("The index of r = %d%n",h.indexOf("r"));
        System.out.printf("The index of World = %d%n",h.indexOf("World"));

        System.out.printf("the index of first l = %d%n",h.indexOf("l"));
        System.out.printf("the index of last l = %d%n",h.lastIndexOf("l"));

        System.out.printf("the index of first l = %d%n",h.indexOf("l",3));
        System.out.printf("the index of last l = %d%n",h.lastIndexOf("l",8));

    }

    public static void stringInform(String s){
        System.out.println("-----------------------------------------------");
        if(s.isBlank()){
            System.out.println("String is blank");
        }
        if(s.isEmpty()){
            System.out.println("The String is empty");
            return;
        }
        System.out.println("----         ------      ------       ------        -----");
        System.out.println("String is not empty");
        System.out.printf("length of the string: %d%n",s.length());
        System.out.printf("first Character: %c %n",s.charAt(0));
        System.out.printf("last Character: %c %n",s.charAt(s.length()-1));
        System.out.println("----         ------      ------       ------        -----");

    }
}
