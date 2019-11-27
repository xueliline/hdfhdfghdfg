public class Solution75 {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int tmp;
        while (start <= end) {
            if (nums[start] > nums[end]) {
                tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        Solution75 solution75=new Solution75();
        solution75.sortColors(new int[] {2,0,2,1,1,0});
    }
}
