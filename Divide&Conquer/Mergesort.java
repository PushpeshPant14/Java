public class Mergesort{
    public static void printanarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void MERGESORT(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //kaam
        int mid = si +(ei-si)/2;
        MERGESORT(arr,si,mid);
        MERGESORT(arr,mid+1, ei);
        mergejoin(arr,si,mid,ei);
    }
    public static void mergejoin(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left
        int j = mid+1; //iterator for right
        int k = 0; //itertaor for temp arr
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //leftover case of left
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //leftover case right
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp in original
        for(k=0,i=si;k<=temp.length-1;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]= {6,3,7,2,1};
        MERGESORT(arr,0,arr.length-1);
        printanarray(arr);
    }
}