public class spiralmatrix {
    public static void spiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while(startcol<=endcol&&startrow<=endrow){
            //top
            for(int i=startcol;i<=endcol;i++){
                System.out.print(matrix[startrow][i]+" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for(int i=endcol-1;i>=startcol;i--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][i]+" ");
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }

    }
    public static void main(String[] args) {   //important
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16},
                        {17,18,19,20}};
        spiral(matrix);
        // for(int i=0;i<=matrix.length;i++){
        //     for(int j=0;j<=matrix[0].length;j++){
        //         System.out.print();
        //     }
        
    }
}
