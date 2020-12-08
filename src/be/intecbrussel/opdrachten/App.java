package be.intecbrussel.opdrachten;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("This is a sentence");
//        tp.printFilteredWords(word -> word.contains("e"));
//        tp.printFilteredWords(word -> word.length() > 4);
//        tp.printFilteredWords(word -> word.startsWith("a"));
//        tp.printFilteredWords(word -> word.length()>1 && word.charAt(1) == 'e');
//        tp.printFilteredWords(word -> containsTwoTimeLetter(word, 'e'));
//
//        tp.printProcessedWords(TextUtil::reverse);
//        TextScrambler ts = new TextScrambler();
//        tp.printProcessedWords(ts::scramble);
//        tp.printProcessedWords(String::toLowerCase);
//        tp.printSum(BigDecimal::new);
//        tp.printNumberValues(BigDecimal::new);
//
//        Predicate<String> p1 = word -> word.contains("e");
//        Predicate<String> p2 = word -> word.contains("a");
//        tp.printFilteredWords(p1.and(p2));
//
//        Function<String, String> f1 = String::toUpperCase;
//        Function<String, String> f2 = TextUtil::reverse;
//        tp.printProcessedWords(f1.andThen(f2));

        TextPrinter tp3 = new TextPrinter("This is a test", word -> System.out.println(word));
        tp3.printFilteredWords(word -> word.length() > 1);
    }

    private static boolean containsTwoTimeLetter(String word, char character) {
        int count = 0;
        for (char ch: word.toCharArray()) {
            if(ch == character){
                count++;
            }
        }
        return count == 2;
    }
}
