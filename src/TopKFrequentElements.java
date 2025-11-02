import java.util.HashMap;

public class TopKFrequentElements {
    public static void main(String[] args) {
        var nums = new int[]{1,2,2,3,3,3};
        var k = 2;
        var result = new int[k];
        var map = new HashMap<Integer, Integer>();
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }


    }
}
