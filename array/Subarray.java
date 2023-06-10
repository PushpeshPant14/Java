public class Subarray {
    public static void subarry(int arr[]){
        for(int i=0;i<arr.length;i++){                    //initial value
            for(int j=i;j<arr.length;j++){                //last value jaha tak loop chlna hai
                for(int k=i;k<=j;k++){                    
                   System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        subarry(arr);
    }
    
}
