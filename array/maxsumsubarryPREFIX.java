public class maxsumsubarryPREFIX {
    public static void maxsumprefix(int arr[]){
        
        int currsum=0;
        int maxsum =Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                currsum = start==0? prefix[end] : prefix[end] - prefix[start-1];
            if (maxsum < currsum){
                maxsum = currsum;
            }
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int arr[]= {1,-2,6,-1,3};
        maxsumprefix(arr);

    }
}
