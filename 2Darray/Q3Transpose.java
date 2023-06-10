public class Q3Transpose {
    
    //transpose 2*3 matrix
   
    public static void transpose(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length;
        int transpose[][]=new int [col][row];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("transpose");
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {3,4,5}};
        //matrix
        System.out.println("matrix");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }                
        transpose(matrix);
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         System.out.print(matrix[i][j]);
        //     }
        //     System.out.println();
        // }

       
    }
    
}
