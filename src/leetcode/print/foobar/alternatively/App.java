package leetcode.print.foobar.alternatively;

public class App {
    public static void main(String[] args) {
        FooBar fooBar = new FooBar(5);
        Thread1 t1 = new Thread1(fooBar, ()-> System.out.print("foo"));
        Thread2 t2 = new Thread2(fooBar, ()-> System.out.print("bar"));

        t2.start();
        t1.start();
    }
}
