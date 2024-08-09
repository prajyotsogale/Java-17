import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] nums = {6,6,0,1,1,4,6};
        minDifference(nums);

    }
    public static void minDifference(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //boolean matched = false;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                else if(nums[i]==nums[j]){
                    //matched=true;
                    break;
                }
                else if(j==nums.length-1){
                    arr.add(nums[i]);
                }
            }
        }
        System.out.println(arr);
    }
}