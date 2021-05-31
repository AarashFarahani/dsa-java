package leetcode.print.in.order;

public class Thread3 extends Thread {
    private Foo foo;
    private Runnable runnable;

    public Thread3(Foo foo, Runnable runnable) {
        this.foo = foo;
        this.runnable = runnable;
    }

    @Override
    public void run() {
        try {
            this.foo.third(this.runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
