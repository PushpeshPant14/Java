public class Q3 {
    public static int profit(int price[]){
        int maxprofit=0;
        int buyprice= price[0];
        for(int i=1;i<price.length;i++){
            if(buyprice<price[i]){
                int profit = price[i]-buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                buyprice = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[]={7,1,2,5};
        System.out.println(profit(price));
    }
    
}
