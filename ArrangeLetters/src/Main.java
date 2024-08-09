public class Main{
    public static void main(String[] args){
        String name = "PraJyoT";
        String lowered = name.toLowerCase();
        char temp = 'a';
        char[] ch = lowered.toCharArray();
        boolean done = false;

        int counter = 0;

        while(!done){

            counter = 0;
            //to sort
            for(int i = 0;i<ch.length-1;i++){
                if(ch[i]>ch[i+1]){
                    temp = ch[i];
                    ch[i]= ch[i+1];
                    ch[i+1]=temp;
                }
            }

            // check if it is sorted
            for(int j = 0;j<ch.length-1;j++){
                if(ch[j]>ch[j+1]){
                    counter+=1;
                }
            }

            if(counter==0){
                done = true;
            }

        }
        System.out.println(ch);


    }
}