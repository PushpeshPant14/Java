public class Sortedrotatedarraysearch {
    public static int binarysearch(int arr[],int si,int ei,int key){
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==key)
            return mid;
            //left sorted
            if(arr[mid]>=arr[si]){
                if(key>=arr[si]&&key<arr[mid]){
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
            }
            //right sorted
            else{
                if(key>arr[mid]&&key<=arr[ei]){
                    si = mid+1;
                }
                else{
                    ei = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={20,30,40,50,60,5,10};
        int ans =binarysearch(arr,0,arr.length-1,10);
        System.out.println(ans);
    }
}
