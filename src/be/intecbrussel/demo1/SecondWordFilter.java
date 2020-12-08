package be.intecbrussel.demo1;

@FunctionalInterface
public interface SecondWordFilter {
    boolean isValid(String valid);
}
