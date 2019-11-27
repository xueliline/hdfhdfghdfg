import java.util.*;

public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        char[] str;
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            str = strs[i].toCharArray();
            Arrays.sort(str);
            if (!map.containsKey(String.valueOf(str))) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(String.valueOf(str), list);
            } else {
                List<String> tmp = map.get(String.valueOf(str));
                tmp.add(strs[i]);
                map.put(String.valueOf(str), tmp);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> list : map.values()) {
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution49 solution49=new Solution49();
        solution49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println();
    }
}