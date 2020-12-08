package be.intecbrussel.opdrachten;

public interface TextUtil {
    static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
