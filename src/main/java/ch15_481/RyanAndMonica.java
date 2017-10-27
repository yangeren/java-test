package ch15_481;

/**
 * Created by hanz on 17-10-23.
 */
public class RyanAndMonica implements Runnable {

  private BankAccount account =  new BankAccount();

  public static void main(String[] args) {
    RyanAndMonica theJob = new RyanAndMonica();
    Thread one = new Thread(theJob);
    Thread two = new Thread(theJob);
    one.setName("Ryan");
    two.setName("Monica");

    one.start();
    two.start();
  }
  @Override
  public void run() {

    for (int x = 0; x < 10; x++) {
      makeWithdrawalNew(10);
      if (account.getBalance() < 0) {
        System.out.println("Overdrawn!");
      }
    }
  }

  private void makeWithdrawal(int amout) {
    System.out.println(account.getBalance());
    System.out.println(amout);
    if (account.getBalance() >= amout) {
      System.out.println(Thread.currentThread().getName() + " is about to withdraw");
      try {
        System.out.println(Thread.currentThread().getName() + " is going to sleep");
        Thread.sleep(500);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " woke up ");
      account.withdraw(amout);
      System.out.println(Thread.currentThread().getName() + " completes the withdrawl");
    }
    else {
      System.out.println("Sorry, not enough " + Thread.currentThread().getName());
    }
  }


  private synchronized void makeWithdrawalNew(int amount) {

    if (account.getBalance() >= amount) {
      System.out.println(Thread.currentThread().getName() + " is about to withdraw");
      try {
        System.out.println(Thread.currentThread().getName() + " is going to sleep");
        Thread.sleep(500);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " work up ");
      account.withdraw(amount);
      System.out.println(Thread.currentThread().getName() + " completes the withdrawl");
    } else {
      System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
    }
  }
}

class BankAccount {
  private int balance = 100;

  public int getBalance() {
    return balance;
  }

  public void withdraw(int amount) {
    balance = balance - amount;
  }
}

