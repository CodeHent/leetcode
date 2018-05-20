package leetcode;

public class ContainerWithMostWater11 {
    public static void main(String[] args){
        int[] a ={5,2,130,1,1,113,4,11,9,4};
        System.out.print(maxArea(a));
    }

    public static int maxArea(int[] height) {
        int l = 0, r = height.length-1;
        int max = Integer.MIN_VALUE;
        while (l<r){ //从两边向中间合拢
            int lmax = height[l],rmax = height[r];
            int area = (r-l)*Integer.min(rmax,lmax);  //计算两个高度之间的共拥有面积
            max = Integer.max(area,max);
            if (height[l] <= height[r]){
                while(l<r && height[l] <= lmax) l++; //这里加等于号主要是让两极的坐标向中间靠拢
            }else{
                while(l<r && height[r] <= rmax) r--;
            }
        }
        return max;
    }
}
