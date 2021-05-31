package leetcode.print.in.order;

public class App {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread1 t1 = new Thread1(foo, ()-> System.out.println("first"));
        Thread2 t2 = new Thread2(foo, ()-> System.out.println("second"));
        Thread3 t3 = new Thread3(foo, ()-> System.out.println("third"));

        t2.start();
        t1.start();
        t3.start();
    }
}
