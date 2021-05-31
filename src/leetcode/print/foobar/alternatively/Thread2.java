package leetcode.print.foobar.alternatively;

public class Thread2 extends Thread {
    private FooBar fooBar;
    private Runnable runnable;

    public Thread2(FooBar fooBar, Runnable runnable) {
        this.fooBar = fooBar;
        this.runnable = runnable;
    }

    @Override
    public void run() {
        try {
            this.fooBar.bar(this.runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
