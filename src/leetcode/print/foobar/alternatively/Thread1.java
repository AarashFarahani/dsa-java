package leetcode.print.foobar.alternatively;

public class Thread1 extends Thread {
    private FooBar fooBar;
    private Runnable runnable;

    public Thread1(FooBar fooBar, Runnable runnable) {
        this.fooBar = fooBar;
        this.runnable = runnable;
    }

    @Override
    public void run() {
        try {
            this.fooBar.foo(this.runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
