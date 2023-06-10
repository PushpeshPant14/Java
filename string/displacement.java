public class displacement {
    public static float shortestpath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== 'N'){
                y++;
            }
            else if(str.charAt(i)== 'S'){
                y--;
            }
            else if(str.charAt(i)== 'E'){
                x++;
            }
            else{
                x--;
            }

        }
        int x2=x*x;
        int y2=y*y;
        float displacement=(float)Math.sqrt(x2+y2);
        return displacement;
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestpath(str));
    }
}
