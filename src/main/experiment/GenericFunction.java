package main.experiment;

public class GenericFunction {

    static <T> void display(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
        System.out.println(element.getClass() + " = " + element);
    }

    public static void main(String[] args) {
        display("Hello");
    }
}
