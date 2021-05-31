package leetcode.print.foobar.alternatively;

import java.util.concurrent.Semaphore;

public class FooBar {
    private int n;
    private Semaphore s1;
    private Semaphore s2;

    public FooBar(int n) {
        this.n = n;
        this.s1 = new Semaphore(0);
        this.s2 = new Semaphore(1);
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            s2.acquire();
            printFoo.run();
            s1.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            s1.acquire();
            printBar.run();
            s2.release();
        }
    }
}
