public class ratinmaze {
    //q1 backtracking
    //issafe
    public static boolean issafe(int maze[][],int row,int col){
        return (row>=0&&row<maze.length && col>=0&&col<maze.length && maze[row][col]==1);
    }

    public static boolean solvemaze(int maze[][],int row,int col,int sol[][]){
        //base
        if(row==maze.length-1&&col==maze.length-1){
            sol[row][col]=1;
            return true;
        }
        //recursion
        if(issafe(maze,row,col)){
            sol[row][col]=1;
            if(solvemaze(maze, row+1, col,sol)){
                return true;
            }
            if(solvemaze(maze, row, col+1,sol)){
                return true;
            }
            //backtrack
            sol[row][col]=0;
            return false;
        }
        return false;
    }
    public static void printSolution(int sol[][]) {
        for (int i = 0; i<sol.length; i++) {
            for (int j = 0; j<sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][]={{1,1,1,1},
                      {0,1,0,1},
                      {1,1,1,1},
                      {1,0,1,1}};
                      int n= maze.length;
        int sol[][]=new int[n][n];
        if(solvemaze(maze,0,0,sol)){
            System.out.println("solution exist");
            printSolution(sol);
        }
    }
}
