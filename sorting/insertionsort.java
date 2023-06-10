public class insertionsort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=i;
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
        arr[j+1]=temp;
        }
    }
    public static  void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,4,1,5,9,2};
        insertion(arr);
        printArray(arr);  
    }
}
