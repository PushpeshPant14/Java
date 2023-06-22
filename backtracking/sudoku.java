public class sudoku {
    public static boolean issafe(int board[][],int row,int col,int digit){
        //row
        for(int i=0;i<=8;i++){
            if(board[i][col]==digit){
                return false;
            }
        }
        //col
        for(int j=0;j<=8;j++){
            if(board[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr= (row/3)*3;
        int sc= (col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokusolver(int board[][],int row,int col){
        //base
        if(row==9){
            return true;
        }
        //recursion
        int nextrow = row;
        int nextcol = col+1;
        if(col+1==9){
            nextrow = row+1;
            nextcol=0;
        }
        //if element is present at that location
        if(board[row][col]!=0){
            return sudokusolver(board, nextrow, nextcol);
        }

        for(int digit=1;digit<=9;digit++){
            if(issafe(board,row,col,digit)){
                board[row][col]=digit;
                if(sudokusolver(board, nextrow, nextcol)){
                    return true;
                }
                board[row][col]=0;
            }
        }
        return false;
    }
    //print
    public static void print(int board[][]) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int board[][] = {{ 8, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
                        { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
                        { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
                        { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
                        { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
                        { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
                        { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
                        { 0, 9, 0, 0, 0, 0, 4, 0, 0 }};
        if(sudokusolver(board,0,0)){
            System.out.println("solution exist");
            print(board);
        }
        else{
            System.out.println("solution doesn't exist");
        }
    }
}
