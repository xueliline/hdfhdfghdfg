import java.util.LinkedList;
import java.util.Queue;

public class Solution207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        int[] outdegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int j = 0; j < numCourses; j++) {
                if (prerequisites[i][j] == 1) {
                    indegree[j]++;
                    outdegree[i]++;
                }
            }
            Queue<Integer> queue=new LinkedList<>();
            for (int k=0;k<numCourses;k++)
            {
                if (indegree[k] == 0)
                    queue.add(k);
            }

        }
    return true;
    }
}