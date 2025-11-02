import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String [] array = {"act","pots","tops","cat","stop","hat"};
        int []alphas = new int[26];
        var hashMap = new HashMap<String, List<String>>();
        for(var word: array){
            for(char ch: word.toCharArray()){
                alphas[ch-'a']++;
            }
            var arrayString = Arrays.toString(alphas);
            if(hashMap.containsKey(arrayString)){
                hashMap.get(arrayString).add(word);
            }else{
                hashMap.put(arrayString, new ArrayList<>(List.of(word)));
            }
            Arrays.fill(alphas,0);
        }
        System.out.println(hashMap.values());
    }
}
//integer array which contains frequency
//I store it to has map with frequency(to String because Array equals/hashcode uses default) and the elements
//take all the values and return
