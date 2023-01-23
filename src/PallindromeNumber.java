public class PallindromeNumber {
    public static void main(String[] args) {
int r,sum=0,temp;
int n=655;
temp=n;
while(n>0) {
    r = n % 10;
    sum = sum * 10 + r;
    n = n / 10;
}
if(temp==sum){
    System.out.println("it is a pallindrome number");

}else{
    System.out.println("it is not a pallindrome");
}
    }
}
