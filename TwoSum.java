import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
      int[]  nums = {2,7,11,15};
      int target=9;
      System.out.print(Arrays.toString(twoSum(nums,target)));
   
    }
    static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
           for(int j=i+1;j<nums.length;j++){
            if(nums[j]==target-nums[i])
            {
                return new int[]{i,j};
            }
           }
        }
        return new int[]{-1,-1};
    }
}
