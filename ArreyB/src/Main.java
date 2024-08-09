class Main{
    public static void main(String[] args){
        //Array is the collection of similar types of data
        int a[] = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        for(int i =0;i<=4;i++){
            System.out.println(a[i]);
        }

        int b[] = {2,33,55,66,77};
        for(int i = 0;i<=4;i++){
            System.out.println(b[i]);
        }



        System.out.println("2D Array");
        int arr[][] = new int [2][2];
        arr[0][0]=0;
        arr[0][1]=1;

        arr[1][0]=2;
        arr[1][1]=3;



        for(int i=0;i<=1;i++){
            for (int j = 0; j <=1 ; j++) {
                System.out.print("  "+arr[i][j]+"  ");
            }
            System.out.println();
        }

        int[] newd = {33,44,44,44,44,400};

        for (int i = 0; i <=newd.length-1 ; i++) {
            System.out.println(newd[i]);
        }

    }
}