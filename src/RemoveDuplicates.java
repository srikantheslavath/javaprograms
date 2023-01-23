import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s= "aaabkdoodd";
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<s.length();i++) {
            h.add(s.charAt(i));
        }
            for(Character a:h){
                System.out.println(a);
            }
        }
    }

