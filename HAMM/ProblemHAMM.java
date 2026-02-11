
public class Hamming {

    public static int hamm(String string1, String string2) {
        int distance = 0;

        if (string1.length() != string2.length()) {
            throw new IllegalArgumentException("Strings must be equal length");
        }

        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                distance++;
            }
        }
