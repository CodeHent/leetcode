package leetcode;

public class Non_decreasingArray665 {
    public static void main(String[] args){
        int[] a = {3,4,2,3};
        int[] b = {4,2,1};
        System.out.print(checkPossibility(b));
    }
//    a. 1 3 5 4 6 7  -->  1 3 4 4 6 7
//    当遇到5 > 4 的情况，这里因为4比5 之前的所有数字都大，所以可以把5 降为4。
//    b. 1 4 5 3 6 7  -->  1 4 5 5 6 7
//    当遇到5 > 3 的情况，这里3比5之前的4小，所以没有选择，只能把3 升为5。
//    当需要第二次改动的时候，可以直接返回false，不需要把剩下的array走完。
//    需注意当i-1<0的情况将n[i] = n[i+1]
    public static boolean checkPossibility(int[] nums) {
        if(nums == null){
            return false;
        }
        boolean modified = false;
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length&&nums[i]>nums[i+1]){
                if(modified) return false;
                else {
                    if(i-1<0||nums[i-1]<=nums[i+1]){
                        nums[i] = nums[i+1];
                    }else{
                        nums[i+1] = nums[i];
                    }
                    modified = true;
                }
            }
        }
        return true;
    }
}
