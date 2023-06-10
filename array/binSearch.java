public class binSearch {
    public static int binarysearch(int list[],int n){
        int start =0;
        int end = list.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(list[mid]==n){
                return mid;
            }
            if(list[mid]>start){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int loc = binarysearch(arr,8);
        if(loc == -1){
            System.out.println("not found");
        }else{
            System.out.println(loc);
        }
    }
}
