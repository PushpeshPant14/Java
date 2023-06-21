//merge sort in string
public class q1{
    public static void printanarray(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Mergesort(char planet[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        Mergesort(planet, si, mid);
        Mergesort(planet, mid+1, ei);
        mergejoin(planet,si,ei,mid);
    }
    public static void mergejoin(char planet,int si,int ei,int mid){
        char temp[]=new char[planet.length];
        int i=si;
        int j=mid;
        int k=0;
        while(i<=mid&&j<=ei){
            if(planet[i]<planet[j]){
                temp[k]=planet[i];
                i++;
            }
            else{
                temp[k]=planet[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=planet[i];
            k++;
            i++;
        }
        while(j<=ei){
            temp[k]=planet[j];
            j++;
            k++;
        }
        for(k=0,i=si;k<=temp.length-1;k++,i++){
            planet[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        char arr[]={'e','d','s','h'};
        Mergesort(arr, 0, arr.length-1);
        printanarray(arr);
    }
}