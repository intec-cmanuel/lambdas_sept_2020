package be.intecbrussel.demo1;

public class TextPrinter {
    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter filter) {
        for (String word : sentence.split(" ")) {
            if (filter.isValid(word)) {
                System.out.println(word);
            }
        }
    }

    public void printFilteredWords2(WordFilter filter, WordFilter filter2) {
        for (String word : sentence.split(" ")) {
            if (filter.isValid(word) && filter2.isValid(word)) {
                System.out.println(word);
            }
        }
    }

    public void printFilteredWords3(WordFilter filter, WordProcessor processor) {
        for (String word : sentence.split(" ")) {
            if (filter.isValid(word)) {
                System.out.println(processor.processWord(word));
            }
        }
    }
}
