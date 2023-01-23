import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        String s = "Nitin";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev = rev + s.charAt(i);
            if (s.toLowerCase().equals(rev.toLowerCase()))
                System.out.println("pallindrome");
             else
                System.out.println("not a pallindrome");
            }
        }




