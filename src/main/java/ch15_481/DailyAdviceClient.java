package ch15_481;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by hanz on 17-10-23.
 */
public class DailyAdviceClient {

  public void go() {
    try {
      Socket s = new Socket("127.0.0.1", 4242);

      InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
      BufferedReader reader = new BufferedReader(streamReader);

      String advice = reader.readLine();
      System.out.println("Today you shoule: " + advice);

      reader.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    DailyAdviceClient client = new DailyAdviceClient();
    client.go();
  }
}
