package string;

import java.util.ArrayList;
import java.util.List;

public class ResveseString
{
    public static void main(String[] args)
    {
        final String inputString = "Saurabh";
        String result ="";
        List<Character> resultString = new ArrayList<>();
        char[] demoString = new char[inputString.length()];

        for (int i = inputString.length()-1; i >= 0; i--)
        {
            result = result + inputString.charAt(i);
            demoString[i] = inputString.charAt(i);
        }
        System.out.println("1- The Reverse string is: " + result);
        System.out.println("2- The Reverse string is: " + demoString.toString());
    }


}
