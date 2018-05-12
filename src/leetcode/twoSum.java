package leetcode;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.


import java.util.HashMap;
import java.util.Map;

public class twoSum {
    //O(n^2)版本代码
    public static int[] twoSum(int[] nums, int target){
        if (nums == null||nums.length == 0 ){
            return null;
        }
        int end = nums.length;
        for (int i = 0;i < nums.length/2;i++) {
            int otherNum = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (otherNum == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //O(n) 版本代码

    public static int[] twoSum2(int[] nums,int target){
       int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }

}
