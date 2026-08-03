// Last updated: 03/08/2026, 21:10:11
class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++) {
            Arrays.fill(board[i],'.');
        }
        solve(board,0);
        return ans;
        
    }

    private void solve(char[][] board,int row) {
        if(row==board.length) {
            ans.add(construct(board));
            return ;
        }
        for(int col=0;col<board.length;col++) {
            if(isSafe(board,row,col)) {
                board[row][col]='Q';
                solve(board,row+1);
                board[row][col]='.';
            }
        }
    }
    
    private boolean isSafe(char[][] board,int row,int col) {
        for(int i=0;i<row;i++) {
            if(board[i][col]=='Q') return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {
            if(board[i][j]=='Q') return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++) {
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    private List<String>construct(char[][] board) {
        List<String> list=new ArrayList<>();
        for(char[] row:board) {
            list.add(new String(row));
        }
        return list;
    }
}