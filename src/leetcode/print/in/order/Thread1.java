package leetcode.print.in.order;

public class Thread1 extends Thread {
    private Foo foo;
    private Runnable runnable;

    public Thread1(Foo foo, Runnable runnable) {
        this.foo = foo;
        this.runnable = runnable;
    }

    @Override
    public void run() {
        try {
            this.foo.first(this.runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
