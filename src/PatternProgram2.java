public class PatternProgram2 {
    public static void main(String[] args) {
        System.out.println("this is reverse right triangle");
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
