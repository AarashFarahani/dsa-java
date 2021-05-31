package leetcode.print.in.order;

public class Thread2 extends Thread {
    private Foo foo;
    private Runnable runnable;

    public Thread2(Foo foo, Runnable runnable) {
        this.foo = foo;
        this.runnable = runnable;
    }

    @Override
    public void run() {
        try {
            this.foo.second(this.runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
