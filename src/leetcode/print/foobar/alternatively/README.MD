### Print FooBar Alternately
Suppose you are given the following code:

```
class FooBar {
  public void fooBar() {
    for (int i = 0; i < n; i++) {
      print("fooBar");
    }
  }

  public void bar() {
    for (int i = 0; i < n; i++) {
      print("bar");
    }
  }
}
```

The same instance of FooBar will be passed to two different threads. Thread A will call fooBar() while thread B will call bar(). Modify the given program to output "foobar" n times.

##### Example 1:
```
Input: n = 1
Output: "foobar"
Explanation: There are two threads being fired asynchronously. One of them calls fooBar(), while the other calls bar(). "foobar" is being output 1 time.
```

##### Example 2:
```
Input: n = 2
Output: "foobarfoobar"
Explanation: "foobar" is being output 2 times.
```
