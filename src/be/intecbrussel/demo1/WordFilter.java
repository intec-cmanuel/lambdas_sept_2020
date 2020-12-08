package be.intecbrussel.demo1;

@FunctionalInterface
public interface WordFilter {
    boolean isValid(String word);
    //boolean isnotValid();
}
