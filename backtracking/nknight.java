public class nknight {
    //safe or attack
    public static boolean issafe(char board[][],int i,int j){
        int m=board.length;
        int n=board.length;
        if ((i + 2) < m && (j - 1) >= 0) {
            board[i + 2][j - 1] = 'k';
            return false;
        }
        if ((i - 2) >= 0 && (j - 1) >= 0) {
            board[i - 2][j - 1] = 'k';
            return false;
        }
        if ((i + 2) < m && (j + 1) < n) {
            board[i + 2][j + 1] = 'k';
            return false;
        }
        if ((i - 2) >= 0 && (j + 1) < n) {
            board[i - 2][j + 1] = 'k';
            return false;
        }
        if ((i + 1) < m && (j + 2) < n) {
            board[i + 1][j + 2] = 'k';
            return false;
        }
        if ((i - 1) >= 0 && (j + 2) < n) {
            board[i - 1][j + 2] = 'k';
            return false;
        }
        if ((i + 1) < m && (j - 2) >= 0) {
            board[i + 1][j - 2] = 'k';
            return false;
        }
        if ((i - 1) >= 0 && (j - 2) >= 0) {
            board[i - 1][j - 2] = 'k';
            return false;
        }
        return true;
    }
    
    //nqueen row placing
    public static void nqueeen(char board[][],int row){
        //base 
        if(row==board.length){
            printboard(board);
            count++;
            return;
        }
        //recursion
        for(int i=0;i<board.length;i++){
            if(issafe(board, row, i)){
                board[row][i] = 'k';
                nqueeen(board, row+1);   // function call
                board[row][i]='*';       // backtracking
                // if(count ==1){     for single solution
                //     return;
                // }
            }
            
        }
    }
    static int count=0;
    public static void printboard(char board[][]){
        System.out.println("---------chess---------");
        for(int i=0;i<=board.length-1;i++){
            for(int j=0;j<=board.length-1;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=2;
        char board[][] = new char[n][n];
        //Initialise
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='*';
            }
        }
        nqueeen(board, 0);
        System.out.println("Total number of solution is "+count);
    }
}

