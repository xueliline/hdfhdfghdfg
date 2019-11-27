public class Solution200 {
    int maxi;
    int maxj;
    int mini=0;
    int minj=0;
    boolean visted[][];
    int dir[][] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public void bfs(int i, int j,char[][] grid) {

        for (int z = 0; z < 4; z++) {
            int newx = i + dir[z][0];
            int newy = j + dir[z][1];
            if (isinarea(newx, newy)) {
                if (visted[newx][newy] == false&&grid[newx][newy]=='1') {
                    visted[newx][newy] = true;
                    bfs(newx, newy,grid);
                }
            }
        }
    }

    public boolean isinarea(int i, int j) {
        return i < maxi && i >= 0 && j >= 0 && j < maxj;
    }

    public int numIslands(char[][] grid) {
        int num = 0;
        maxi = grid.length;
        if (maxi == 0)
            return 0;
        maxj = grid[0].length;
        visted = new boolean[maxi][maxj];
        for (int i = 0; i < maxi; i++) {
            for (int j = 0; j < maxj; j++) {
                if (visted[i][j] == false && grid[i][j] == '1') {
                    visted[i][j]=true;
                    bfs(i, j,grid);
                    num++;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        char[][] tmp={{'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};
        Solution200 solution200=new Solution200();
        solution200.numIslands(tmp);
    }
}
