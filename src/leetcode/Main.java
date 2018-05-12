package leetcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = new int[] {3,2,4};
        int target = 6;
        int[] result = twoSum.twoSum2(a,target);
        System.out.print(result[0]+" "+ result[1]);

    }

   public static int maxChunksToSorted( int[] arr){
        if (arr==null||arr.length==0){
            return 0;
        }
        int count = 0;

        int n = arr.length;
        int max1 = 0,max2 =0;

        for (int i=0;i<n;i++) {
            if(max1 == arr[i]){
                count++;
                continue;
            }
            max1 = Math.max(max1, arr[i]);
            if (max1 != max2) {
                count++;
                max2 = max1;
            }
        }
       return count;
   }
}
