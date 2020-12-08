package be.intecbrussel.demo1;

public class WordFilterImplementation  implements WordFilter{
    @Override
    public boolean isValid(String word) {
        return word.length() > 5;
    }

    public boolean isnotValid() {
        return false;
    }
}
