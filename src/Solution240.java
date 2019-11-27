public class Solution240 {
    int maxi = 0;
    int maxj = 0;
    int mini = 0;
    int minj = 0;
    boolean [][]visted;
    private boolean search(int[][] matrix, int i, int j, int target) {
        boolean res1 = false;
        boolean res2 = false;
        boolean res3 = false;
        if (matrix[i][j] == target)
        {
            return true;
        }
        if(matrix[i][j]>target)
            return false;

        if (matrix[i][j] < target) {
            if (i + 1 < maxi&&visted[i+1][j]==false)
            {
                visted[i+1][j]=true;
                res1 = search(matrix, i + 1, j, target);
            }

            if (j + 1 < maxj&&visted[i][j+1]==false)
            {
                visted[i][j+1]=true;
                res2 = search(matrix, i, j + 1, target);
            }

        }

        return res2 || res1;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null)
            return false;
        if(matrix.length==0)
            return false;
        if(matrix[0].length==0)
            return false;
        maxi=matrix.length;
        maxj=matrix[0].length;
        visted=new boolean[maxi][maxj];
        visted[0][0]=true;
        return search(matrix,0,0,target);
    }

    public static void main(String[] args) {
        Solution240 solution240=new Solution240();
        int [][]tmp={
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        boolean res=solution240.searchMatrix(tmp,8);
    }
}