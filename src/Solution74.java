public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int h = matrix.length - 1;
        int index=0;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (matrix[mid][0] > target)
                h = mid - 1;
            if (matrix[mid][0] < target)
                l = mid + 1;
            if (matrix[mid][0] == target)
                return true;
        }
        if(h==-1)
            return false;
        index=h;
        l=0;
        h=matrix[0].length-1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (matrix[index][mid] > target)
                h = mid - 1;
            if (matrix[index][mid] < target)
                l = mid + 1;
            if (matrix[index][mid] == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution74 solution74=new Solution74();
        int [][] res=new  int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,50},
               };
       boolean rrr= solution74.searchMatrix(res,13);
    }
}
