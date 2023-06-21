public class nqueen {

    //safe or attack
    public static boolean issafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //daigonal left up
        for(int i=row-1 ,j=col-1; i>=0&&j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
            
        }
        //daigonal right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j] =='Q'){
                return false;
            }
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
                board[row][i] = 'Q';
                nqueeen(board, row+1);   // function call
                board[row][i]='x';       // backtracking
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
        int n=4;
        char board[][] = new char[n][n];
        //Initialise
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nqueeen(board, 0);
        System.out.println("Total number of solution is "+count);
    }
}