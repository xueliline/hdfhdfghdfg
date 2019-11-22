import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0)
            return 0;
        if(nums==null)
            return 0;
        Set<Integer> set = new HashSet<>();
        int maxlen = 1;
        for (int i : nums) {
            set.add(nums[i]);
        }
        for (int i : nums) {
            if (!set.contains(nums[i] - 1)) {
                int cur = nums[i];
                int curlen = 1;
                while (set.contains(cur + 1)) {
                    curlen++;
                    cur = cur + 1;
                }
                maxlen = maxlen > curlen ? maxlen : curlen;
            }
        }
        return maxlen;
    }
}