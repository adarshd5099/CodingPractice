package main.experiment;

public class GetClass {
    public static void main(String[] args) throws NoSuchMethodException {
        var a = new Integer(1);
        var b = a.getClass();
        var c = b.getMethod("parseInt", String.class);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
