import java.util.*;
public class abhi {
    // public static int workleft(int work,int f1,int d1,int f2,int d2){
    //     int a=0;
    //     a = work-((f1*d1)+(f2*d2));
    //     return a;
    // }
    // public static void main(String[] args) {
    //     int result = workleft(155, 15, 6, 10, 4);
    //     System.out.println(result);
    // }

    // public static void main(String[] args) {
    //     String myStr = "abhi lucky abhi";
    //     String[] splited = myStr.split(" ");   //important
    //     Arrays.sort(splited);
    //     System.out.println(Arrays.toString(splited));
    //     int max = 0;
    //     int count= 1;
    //     String word = splited[0];
    //     String curr = splited[0];
    //     for(int i = 1; i<splited.length; i++){
    //         if(splited[i].equals(curr)){
    //             count++;
    //         }
    //         else{
    //             count =1;
    //             curr = splited[i];
    //         }
    //         if(max<count){
    //             max = count;
    //             word = splited[i];
    //         }
    //     }
    //     System.out.println(max + " x " + word);
    // } 

    public static boolean issafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //daigonal left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //daigonal rightup
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nqueen(char board[][],int row){
        //base case
        if(row==board.length){
            printarr(board);
            return;
        }
        //recursion
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
                nqueen(board,row+1);
                board[row][j]='.';
            }
        }
    }
    public static void printarr(char board[][]){
        System.out.println("------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=4;
        char board[][]= new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqueen(board,0);
    }
}
