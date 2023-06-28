import java.util.ArrayList;

public class ContainerwMWBF {
    public static int ContainerwMW(ArrayList<Integer> height){
        int maxwater=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                //area = height * width;
                int h = Math.min(height.get(i), height.get(j));
                int w = j-i;
                int currwater = h*w;
                maxwater = Math.max(maxwater, currwater);
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        //brute force  -- TC = o(n^2)
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(ContainerwMW(height));

    }
}
