public class occurance {
    
    public static int firstoccurance(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurance(arr, i+1, key);
    }

    public static int lastoccurance(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int index = lastoccurance(arr, i+1, key); 
        if(index==-1&& arr[i]==key){
            return i;
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[]={5,5,5,5};
        System.out.println(firstoccurance(arr,0,5));
        System.out.println(lastoccurance(arr,0,5));
    }

}
