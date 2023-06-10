public class diagonalsum {
    public static void diagonalBF(int matrix[][]){  //BF is brute force , brute force is basic apporach 
                                                   // time complexity is O(n'2)
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=matrix[0].length;j++){
                if(i==j){
                    //Primary diagonal
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    //secondary diagonal
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void daigonalOp(int matrix[][]){       //op is optimised approach 
                                                        //time complexity is O(1)
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //primary diagonal
            sum+=matrix[i][i];
            //secondary diagonal
            sum+=matrix[i][matrix.length-i-1];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        diagonalBF(matrix);
        daigonalOp(matrix);
    }
}
