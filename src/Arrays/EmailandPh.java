package Arrays;

import java.util.ArrayList;
import java.util.List;

public class EmailandPh {

    private static final int PHONE_NUMBER_LENGTH = 10;

    public static void main(String[] args) {
        String input = "hsqisbisqshoh1hqshsssvqsvissuwhuhouhu85199107837uodvdyivdhddijdp'dpdbdhwdvdbdjd" +
                " nddnddnjdbqwij;bddj  srikantheslavath6@gmail.com  @ranjith @srkanth suiegeyeievwebeebhvdyp1wdibdbdbdd9705776350 iqgdyidhkdbkdhlb knckcnc";
        List<String> emails = extractEmails(input);
        List<String> phoneNumbers = extractPhoneNumbers(input);

        System.out.println("Emails: " + emails);
        System.out.println("Phone Numbers: " + phoneNumbers);
    }

    private static List<String> extractEmails(String input) {
        List<String> emails = new ArrayList<>();
        int length = input.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);

            if (c == '@') {
                int j = i;
                while (j < length && input.charAt(j) != ' ') {
                    sb.append(input.charAt(j++));
                }

                emails.add(sb.toString());
                sb.setLength(0);
            }
        }

        return emails;
    }

    private static List<String> extractPhoneNumbers(String input) {
        List<String> phoneNumbers = new ArrayList<>();
        int length = input.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);

            if (Character.isDigit(c)) {
                sb.append(c);

                if (sb.length() == PHONE_NUMBER_LENGTH) {
                    phoneNumbers.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.setLength(0);
            }
        }

        return phoneNumbers;
    }
}


