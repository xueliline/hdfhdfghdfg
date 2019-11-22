public class Solution130 {
    private  boolean dfs(int i,int j,char[][] board)
    {
if((i==0||i==board.length)&&board[i][j]=='O')
    return true;
        if((j==0||j==board[0].length)&&board[i][j]=='O')
    return true;
        return false;
    }
    public void solve(char[][] board) {
        boolean res[][] = new boolean[board.length][board[0].length];
      for (int i=0;i<board.length;i++)
          for (int j=0;j<board[0].length;j++)
          {
              if(board[][])
          }
    }
}