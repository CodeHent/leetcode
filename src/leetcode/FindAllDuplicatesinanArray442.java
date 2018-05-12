package leetcode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindAllDuplicatesinanArray442 {

    public static void main(String[] arg){
        int[] a = {4,3,2,7,8,2,3,1};
        List<Integer> b = findDuplicates(a);
        Iterator<Integer> iterator = b.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new LinkedList<>();

        int n = nums.length;
        for(int i=0;i<n;i++){
            int val = Math.abs(nums[i]); //这里主要是用数组中的数字来进行下标标记，所以要对数组中的数字确定的下标数字进行取负
            if(nums[val-1]<0){  //用来做判断判断当前数组下标的正负，如果为负就说明该下标的数字被访问了两遍
                res.add(val);
            }
            nums[val-1] = -nums[val-1]; //用来标记访问过的数字
        }

        return res;
    }
}
