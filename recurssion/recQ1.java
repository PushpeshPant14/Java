public class recQ1 {
    public static void find(int arr[],int key,int i,StringBuilder sb){
        if(i==arr.length){
            System.out.println(sb);
            return;
        }
        if(arr[i]==key){
            sb.append(i+" ");
        }
        find(arr, key, i+1, sb);
    }
    public static void main(String[] args) {
        //{3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2
        int arr[]={3,2,4,5,6,2,6,2,2};
        int key =2;
        find(arr, key, 0, new StringBuilder(""));
    }
}
