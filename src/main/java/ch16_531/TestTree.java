package ch16_531;

import java.util.TreeSet;

/**
 * Created by hanz on 17-10-24.
 */
public class TestTree {

  public static void main(String[] args) {
    new TestTree().go();
  }

  public void go() {
    Book b1 = new Book("How Cats Work");
    Book b2 = new Book("Remix your Body");
    Book b3 = new Book("Finding Emo");

    TreeSet<Book> tree = new TreeSet<Book>();
    tree.add(b1);
    tree.add(b2);
    tree.add(b3);
    System.out.println(tree);
  }

}

class Book implements Comparable<Book> {
  String title;
  public Book(String t) {
    title = t;
  }

  @Override
  public int compareTo(Book o) {
    return title.compareTo(o.title);
  }

  @Override
  public String toString() {
    return title;
  }
}
