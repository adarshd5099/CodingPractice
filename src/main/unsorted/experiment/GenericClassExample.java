package main.unsorted.experiment;

class MyClass<A, B> {
    A objectOne;
    B objectTwo;

    public MyClass(A objectOne, B objectTwo) {
        this.objectOne = objectOne;
        this.objectTwo = objectTwo;
    }

    public void print() {
        System.out.println("objectOne is " + this.objectOne);
        System.out.println("objectTwo is " + this.objectTwo);
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        MyClass<Integer, Integer> z = new MyClass<>(1, 2);
        z.print();

        MyClass<String, String> a = new MyClass<>("hello", "world");
        a.print();
    }
}
