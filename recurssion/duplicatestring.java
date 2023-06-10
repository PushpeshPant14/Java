public class duplicatestring {
    //remove duplicate word from string
    public static void duplicate(String str,int index,StringBuilder sb,boolean track[]){
        if(index==str.length()){
            System.out.println(sb);
            return;
        }
        char curchar= str.charAt(index);
        if(track[curchar-'a']==true){
            duplicate(str, index+1, sb, track);
        }
        else{
            track[curchar-'a']=true;
            duplicate(str, index, sb.append(curchar), track);
        }
    }
    public static void main(String[] args) {
        String Str = "pushpeshpant";
        System.out.println(Str);
        duplicate(Str, 0, new StringBuilder(), new boolean[26]);
        
    }
}