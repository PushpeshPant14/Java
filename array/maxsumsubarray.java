public class maxsumsubarray {
    public static void maxsumofsubarray(int arr[]){
        
        int maxsum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currsum=0;
                for(int k=i;k<=j;k++){
                    currsum = currsum + arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max sum of subarray is "+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxsumofsubarray(arr);
    }
}
