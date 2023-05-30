package Practice2;

public class Swap2Without3 {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        System.out.println("value of a :" +a      +     "value of b:"+b);

        a=a+b;
        b= a-b;
        a= a-b;

        System.out.println("value of a: " +a  + "value of b " +b);

    }


}
