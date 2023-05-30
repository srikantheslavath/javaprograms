package Arrays;

public class PrintBeforeChar {
    public static void main(String[] args) {
            String input = "Hello, this is a sample  srikantheslavath@gmail.com string";
            char symbol = '@';
            int symbolIndex = input.indexOf(symbol);
            int limit = 30;
            int count = 0;

            for (int i = symbolIndex - 1; i >= 0; i--) {
                System.out.print(input.charAt(i));
                count++;
                if (count == limit) {
                    break;
                }
            }
        }
    }


