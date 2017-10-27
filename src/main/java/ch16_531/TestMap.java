package ch16_531;

import java.util.HashMap;

/**
 * Created by hanz on 17-10-24.
 */
public class TestMap {
  public static void main(String [] args) {

    HashMap<String, Integer> scores = new HashMap<String, Integer>();

    scores.put("33", 42);
    scores.put("Bert", 342);
    scores.put("Skyler", 420);



    System.out.println(scores);
    System.out.println(scores.get("Bert").getClass());
  }
}
