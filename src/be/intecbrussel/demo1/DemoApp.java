package be.intecbrussel.demo1;

public class DemoApp {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter("Sinterklaas is bij mijn niet geweest dit jaar.");

        // First primitive way!
        WordFilter wf = new WordFilterImplementation();
        //textPrinter.printFilteredWords(wf);

        // Second way (anonymouse nested classes)
        WordFilter anonymouseFilter = new WordFilter() {
            @Override
            public boolean isValid(String word) {
                return word.length() > 5;
            }
        };
        //textPrinter.printFilteredWords(anonymouseFilter);

        // Lambda is love
        textPrinter.printFilteredWords(word -> word.length() > 5);
        textPrinter.printFilteredWords2(word -> word.length() > 5 , word -> word.startsWith("S"));
        textPrinter.printFilteredWords(word -> word.length() <= 4);
        textPrinter.printFilteredWords(word -> false);
        textPrinter.printFilteredWords3(word -> word.length() > 5, word -> word.toUpperCase());
        textPrinter.printFilteredWords(word -> word.length() > 5);

        // Statisch methodereferentie
        textPrinter.printFilteredWords(DemoApp::isValid); // word -> isValid(word)

        // Gebonden methodereferentie
        DemoApp appObject = new DemoApp();
        textPrinter.printFilteredWords(appObject::isDefinitalyValid); // word -> appObject.isDefinitalyValid(word)

        // Ongebonden methodereferentie
        textPrinter.printFilteredWords(String::isEmpty);

        // Constructorreferentie
        textPrinter.printFilteredWords(Boolean::new);

        WordFilter wordFilter = word -> word.length() > 5;
        textPrinter.printFilteredWords(wordFilter);
    }

    public static boolean isValid(String word){
        return true;
    }

    public boolean isDefinitalyValid(String word) {
        return true;
    }


}
