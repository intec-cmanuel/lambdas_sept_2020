package be.intecbrussel.opdrachten;

public class TextScrambler {
    public String scramble(String word) {
        return word.replaceAll("a", "@")
                   .replaceAll("e", "€")
                   .replaceAll("l", "1")
                   .replaceAll("o", "0");
    }
}
