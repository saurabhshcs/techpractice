package string;

/*
 * @created 26/06/2022 -01:25
 * @project techpractice
 * @author  saurabhshcs
 */

public class panagram {
    public static void main(String[] args) {
        String inputString = "Thw quick brown fox jumpps over the lazy dog";

        System.out.println("Is the following input string is the panagram string?");
        System.out.println("The input string is: " + inputString);
        System.out.println(isPanagram(inputString));
    }

    private static Boolean isPanagram(String inputString) {

        if (inputString.length() < 26) {
            return Boolean.FALSE;
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (inputString.indexOf(ch) < 0) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
