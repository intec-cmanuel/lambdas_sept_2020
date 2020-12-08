package be.intecbrussel.opdrachten;

import be.intecbrussel.demo1.WordFilter;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextPrinter {
    private String sentence;
    private Consumer<String> consumer;

    private String numberSentence = "1684968465464654 649864684654 4849684654646";

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public TextPrinter(String sentence, Consumer<String> consumer) {
        this.sentence = sentence;
        this.consumer = consumer;
    }

    public void printFilteredWords(Predicate<String> filter) {
        for (String word : sentence.split(" ")) {
            if (filter.test(word)) {
                consumer.accept(word);
            }
        }
    }

    public void printProcessedWords(Function<String, String> processor) {
        for (String word : sentence.split(" ")) {
            System.out.println(processor.apply(word));
        }
    }

    public void printNumberValues(Function<String, BigDecimal> parser) {
        for (String word : numberSentence.split(" ")) {
            System.out.println(parser.apply(word));
        }
    }

    public void printSum(Function<String, BigDecimal> parser) {
        BigDecimal total = new BigDecimal(1);
        for (String word : numberSentence.split(" ")) {
            total = total.multiply(parser.apply(word));
        }
        System.out.println(total);
    }
}
