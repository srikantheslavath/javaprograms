public class PatternProgram3 {
    public static void main(String[] args) {
        System.out.println("combination of pattern1 and 2");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
