public class LinearSearch {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int number = 5;
        System.out.println("the number is found at index "+Search1(number,arr) );
    }

    public static int Search1(int key,int arr[])
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

}
