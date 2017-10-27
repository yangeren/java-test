package ch15_481;

/**
 * Created by hanz on 17-10-23.
 */



class TestSync implements Runnable {

  private int balance;

  @Override
  public void run() {
    for (int i = 0; i<50; i++) {
      increment();
      System.out.println("balance is " + balance);
    }

  }

  public synchronized void increment() {
    int i = balance;
    balance += 1;
  }
}
public class TestSyncTest {
  public static void main(String[] args) {
    TestSync job = new TestSync();
    Thread a = new Thread(job);
    Thread b = new Thread(job);
    a.start();
    b.start();
  }
}
