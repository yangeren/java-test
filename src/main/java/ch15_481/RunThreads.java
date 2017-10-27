package ch15_481;

/**
 * Created by hanz on 17-10-23.
 */
public class RunThreads implements Runnable {

  public static void main(String[] args) {
    RunThreads runThreads = new RunThreads();
    Thread alpha = new Thread(runThreads);
    Thread beta = new Thread(runThreads);
    alpha.setName("Alpha thread");
    beta.setName("Beta thread");
    beta.start();
    alpha.start();
  }

  @Override
  public void run() {
    for (int i = 0; i < 25; i++) {
      String threadName = Thread.currentThread().getName();
      System.out.println(threadName + " is running");
    }
  }
}

