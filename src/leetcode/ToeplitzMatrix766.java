package leetcode;

public class ToeplitzMatrix766 {
    public static void  main(String[] args){
        int[][] a  = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int[][] b = {{97,97},{80,97},{10,80}};
        int[][] c = {{11,74,0,93},{40,11,74,7}};
        System.out.print(isToeplitzMatrix(c));
    }
//    public boolean isToeplitzMatrix(int[][] matrix) {
//        for (int i = 0; i < matrix.length - 1; i++) {
//            for (int j = 0; j < matrix[i].length - 1; j++) {
//                if (matrix[i][j] != matrix[i + 1][j + 1]) return false;
//            }
//        }
//        return true;
//    }


    //本题主要是要从左下脚开始自下向上，在自左向右进行遍历，这里注意设置边界
    //自下向上的 i=row-1,j=0; i+1<row，j<col
    //自左向右的 i=0，j=col-1；i<row&&j+1<col
    //这里注意坐标的自增
    public static boolean isToeplitzMatrix(int[][] matrix) {
        boolean result = false;
        if(matrix == null){
            return result;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int tempOld = -1;
        int tempNew;
        for(int i = row-1; i >= 0;i--){
           int rowi = i;
            tempOld = matrix[rowi][0];
            for (int j = 1;j<col&&rowi+1<row;j++){
                tempNew = matrix[++rowi][j];
                if(tempNew != tempOld){
                    return result ;
                }
                tempOld = tempNew;
            }
        }

        for(int j=1;j<col;j++){
            int colj = j;
            tempOld = matrix[0][colj];
            for (int i=1;i<row&&colj+1<col;i++){
                tempNew = matrix[i][++colj];
                if(tempNew!=tempOld){
                    return result;
                }
                tempOld = tempNew;
            }
        }
        result = true;
        return result;
    }
}
