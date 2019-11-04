

public class Solution70 {
	
    public int climbStairs(int n) {
    	int [] res=new int[n+2];
    	res[1]=1;
    	res[2]=2;
    	if(n>2) {
    		for (int i = 3; i <= n; i++) {
				res[i]=res[i-1]+res[i-2];
			}
    	}
        return res[n];
    }
}