public class sortedsearch {
    public static boolean staircasesearch(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col]==key){
                System.out.println("Found at index ("+row+","+col+")");
                return true;
            }
            else if(matrix[row][col]>key){
                col--;      //left
            }
            else{
                row++;     //bottom
            }
        }
        System.out.println("Not found");
        return false;
    }
    public static boolean staircasesearchfromleftbottom(int matrix[][],int key){
        int row=matrix.length-1;
        int col= 0;
        while(row>=0&&col<matrix[0].length){
            if(matrix[row][col]==key){
                System.out.println("Found at index ("+row+","+col+")");
                return true;
            }
            else if(matrix[row][col]>key){
                row--;       //top 
            }
            else{
                col++;      //right
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key =33;
        staircasesearch(matrix, 100);
        staircasesearchfromleftbottom(matrix,key);
    }
}
