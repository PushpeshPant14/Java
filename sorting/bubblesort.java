public class bubblesort {
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,1,2};
        bubble(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
