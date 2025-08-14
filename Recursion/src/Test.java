public class Test {
    public static void main(String[] args) {
        printNum(1,5);
    }

//    public static void printNum(int num){
//        if(num==0){
//            return;   //base case
//        }
//        System.out.println(num);  //print
//        printNum(num-1);     //recursion
//
//    }

    public static void printNum(int num , int numEnd){
        if(num>numEnd){
            return;
        }
        System.out.println(num);
        printNum(num+1,numEnd);
    }
}


// for 5 to 1 first solved
//stack in memory
//printNum  n=0
//printNum  n=1
//printNum  n=2
//printNum  n=3
//printNum  n=4
//printNum  n=5
//main n=5


