public class LargestElementFromArray {
    public static void main(String[] args) {
        int[] a = {10, 200, 100, 66};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            }
                System.out.println("maximum num" + max);
            }
        }


