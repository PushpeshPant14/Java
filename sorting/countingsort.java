public class countingsort {
    public static void counting(int arr[]){
       int largest = Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        largest= Math.max(largest, arr[i]);
       }
        //count freq
        int count[]= new int [largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){ //range tak loop
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,2,3,1};
        counting(arr);
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]);
        }
    }
}
