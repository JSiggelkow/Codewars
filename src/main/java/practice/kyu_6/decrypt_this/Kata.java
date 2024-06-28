package practice.kyu_6.decrypt_this;

import java.util.Arrays;

public class Kata {
    public static String encryptThis(String text) {

        if (text.isEmpty() || text.isBlank()) return "";

        text = Arrays.stream(text.split(" "))
                .map(s -> {
                    if (s.length() > 2) return switchChars(s);
                    return s;
                })
                .map(s -> s.replaceFirst(String.valueOf(s.charAt(0)), String.valueOf(+s.charAt(0))))
                .reduce((a,b) -> a + " " + b)
                .orElse("");

        return text;
    }

    private static String switchChars(String s) {
        StringBuilder sB = new StringBuilder(s);
        char lastChar = s.charAt(s.length() - 1);
        char secondChar = s.charAt(1);
        sB.setCharAt(1, lastChar);
        sB.setCharAt(s.length() - 1, secondChar);
        return sB.toString();
    }
}
