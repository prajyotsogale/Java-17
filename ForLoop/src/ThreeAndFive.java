public class ThreeAndFive {
    public static void main(String[] args){
        int sum = 0;
        int counter = 0;
        for(int i= 1;i<=1000;i++){
            if(i%3==0 && i%5==0){
                sum += i;
                counter +=1;
                System.out.println(i+" is divisible by both 3 and 5");
                if(counter==5){
                    System.out.println("total sum is "+sum);
                    break;
                }
            }
        }


    }
}
