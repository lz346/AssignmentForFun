package Strings;

import java.util.*;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        String string3 = string2.concat(string1);
        return string3;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        if (string.equals("")){
            return string;
        }
        return String.format("%1$" + string.length() + "s", "");
}

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        char[] result = string.toCharArray();
        for (int i = 0; i < result.length; i++)
        {
            char c = result[i];
            if (Character.isUpperCase(c))
            {
                result[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                result[i] = Character.toUpperCase(c);
            }
        }
        return new String(result);
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string1.length() ||
                i < string2.length(); i++){

            if (i < string1.length())
                result.append(string1.charAt(i));

            if (i < string2.length())
                result.append(string2.charAt(i));

        }

        return result.toString();

    }
}
