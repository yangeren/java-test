package ch15_481;

import junit.framework.TestCase;

/**
 * Created by hanz on 17-10-23.
 */
public class MyRunnerableTest extends TestCase {

  public static void main(String[] args) {
    Runnable threadJob =  new MyRunnerable();
    Thread myThread = new Thread(threadJob);

    myThread.start();

    System.out.println("back in main");
  }

}