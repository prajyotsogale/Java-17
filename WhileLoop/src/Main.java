//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        for(int i=0; i<=5; i++){
            System.out.println(i);
        }
        int j=0;
//        while(j<=5){
//            System.out.println(j);
//            j++;
//        }
        //another common way to do this is

        while(true){
            System.out.println(j);
            if(j==5){
                break;
            }

            j++;
        }
        boolean isReady = false;
        int k=10;
        do{
            if(k==15){
                break;
            }
            System.out.println(k);
            k++;
            isReady = (k>0);

        }while(isReady);


    }
}