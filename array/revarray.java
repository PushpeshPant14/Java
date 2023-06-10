public class revarray {
    public static void reversearray(int arr[]){
        int first=0;int last=arr.length-1;
        while(first<last){
            int temp=0;
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        reversearray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    
    }
}
