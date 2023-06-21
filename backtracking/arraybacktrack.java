public class arraybacktrack{
    public static void changearr(int arr[],int i,int value){
        //base case
        if(i==arr.length){
            Printanarr(arr);
            return;
        }
        //recurssion
        arr[i]=value;
        changearr(arr, i+1, value+1);
        arr[i]=arr[i]-2;
    }

    static void Printanarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= new int[5];
        changearr(arr, 0, 1);
        Printanarr(arr);
    }
}