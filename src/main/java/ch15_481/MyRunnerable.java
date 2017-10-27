package ch15_481;

/**
 * Created by hanz on 17-10-23.
 */
public class MyRunnerable implements Runnable {

  public void run() {
    go();
  }

  public void go() {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    doMore();
  }

  public void doMore() {
    System.out.println("top o ' the stack");
  }

}
