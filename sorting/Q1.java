public class Q1 {
    public static void bubblesort(int arr[]){ 
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){     //in bubble sort we compare element with adjacent element
                if(arr[j]<arr[j+1]){              //descending  order
                int temp= arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=0;j<arr.length;j++){
                if(arr[min]>arr[j]){          
                    //swap
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }

    public static void insertionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev =i-1;
            while(prev>=0&&arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        //finding largest for range 
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        //freq count
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=count.length-1;i>0;i--){
            if(count[i]>0){
                arr[j]=i;
                j++;
            }
        }
    }

    public static void printanarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,3,6};
        countingsort(arr);
        printanarray(arr);
    }
}
