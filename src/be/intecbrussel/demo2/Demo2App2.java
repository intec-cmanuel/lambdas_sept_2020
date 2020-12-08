package be.intecbrussel.demo2;

import java.util.function.Predicate;

public class Demo2App2 {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("This is a lecture about blabla");

//        tp.printFilteredWords(word -> word.length() > 5);
//
//        TextPrinter tp2 = new TextPrinter("25 65 75 95 55");
//        tp2.parseInt(Integer::parseInt);

        tp.forEach(word -> System.out.println(word.toUpperCase()));

        Predicate<String> cond1 = word -> word.length() < 4;
        Predicate<String> cond2 = word -> word.startsWith("s");
        Predicate<String> combinedCondition = cond1.and(cond2);
        Predicate<String> condition = cond1.or(cond2);
        Predicate<String> condition2 = cond1.negate();
        Predicate<String> condition3 = Predicate.not(cond1);
        Predicate<String> condition4 = Predicate.isEqual(null);
    }
}
