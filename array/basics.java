public class basics {

    public static void linearsearch(int list[],int n){
        int loc = -1;
        for(int i=0;i<list.length;i++){
            if(list[i]==n){
                loc = i;
               break;
            }
        }
        if(loc==-1){
            System.out.println("not found");
        }else{
            System.out.println("found at location "+loc);
        }
    }

    public static void largestvalue(int list[]){
        int larger = Integer.MIN_VALUE;
        for(int i=0;i<list.length;i++){
            if(larger<list[i]){
                larger = list[i];
            }
        }
        System.out.println("largest value in array is "+ larger);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        linearsearch(arr,1);
        largestvalue(arr);
    }
}

