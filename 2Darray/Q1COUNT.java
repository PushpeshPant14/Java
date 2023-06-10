public class Q1COUNT{
    //count of 7;
    public static void count(int matrix[][],int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
        }
        if(count>0){
            System.out.println(count);
        }
        else{
            System.out.println("not found");
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},{8,8,7}};
        count(matrix,7);
    }
}
