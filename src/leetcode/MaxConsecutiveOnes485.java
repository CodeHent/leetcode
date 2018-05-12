package leetcode;

public class MaxConsecutiveOnes485 {
     public static void main(String[] args){
        int[] a = {1,1,0,1,1,1};
        System.out.print(findMaxConsecutiveOnes(a));
     }

    private static int findMaxConsecutiveOnes(int[] nums) {
         int size = nums.length;
         int max = 0;
         int rec = 0;
        for(int i : nums) {
            if(nums[i]==0){
                if(rec>max){
                    max = rec;
                }
                rec = 0;
            }else{
                rec++;
            }
        }
        return rec>max? rec:max; //主要用来比较数组最后遍历完成后的最长1大小与之前大小地比较，输出大者
    }
}
