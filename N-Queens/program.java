class Solution {

    public static Boolean isSafe(int row, int col, char[][] board){

        // horizontal line check
        for(int j=0;j<board.length;j++){
            if(board[row][j] == 'Q')
                return false;
        }

        // vertical line check
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q')
                return false;
        }

        // Upper left check
        for(int r=row,c=col; c>=0 && r>=0 ; r--,c--){
            if(board[r][c]=='Q')
                return false;
        }

        // Upper right check
        for(int r=row,c=col; c<board.length && r>=0 ; r--,c++){
            if(board[r][c]=='Q')
                return false;
        }

        // lower left check
        for(int r=row,c=col; c>=0 && r<board.length ; r++,c--){
            if(board[r][c]=='Q')
                return false;
        }

        // lower right check
        for(int r=row,c=col; c>=board.length && r<board.length ; r++,c++){
            if(board[r][c]=='Q')
                return false;
        }

        return true;
        
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards){
        String row="";
        List<String> newBoard = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]== 'Q')
                    row+='Q';
                else
                    row+='.';
                
            }
            newBoard.add(row);
        }

        allBoards.add(newBoard);

    }

    public static void helper(char[][] board, List<List<String>> allBoards, int col){
        if(col==board.length) // base condition
        {
            saveBoard(board, allBoards);
            return;
        }

        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col]= '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);
        return allBoards;
        
    }
 
}
