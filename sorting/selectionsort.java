public class selectionsort {
    public static void selection(int arr[]){
       for(int i=0;i<arr.length-1;i++){
        int min = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                int temp=arr[j];
                arr[j]=arr[min];
                arr[min]=temp;
            }
        }
       }
       
    }
    public static  void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selection(arr);
        printArray(arr);
    }
}
