import java.util.HashMap;

public class OccurenceOfEachCharacter {
    public static void main(String[] args) {
        String s="baabbbcchihi";
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=s.length()-1;i>0;i--){
            if(hmap.containsKey(s.charAt(i))) {
                int count = hmap.get(s.charAt(i));
                hmap.put(s.charAt(i), ++count);
            }
            else{
                hmap.put(s.charAt(i),1);
            }
        }
        System.out.println(hmap);
    }
}
