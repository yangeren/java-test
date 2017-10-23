package ch14_454;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by hanz on 17-10-23.
 */


class WriteTextFile {
  public static void main(String[] args) {
    try {
    FileWriter writer = new FileWriter("myText.txt");
    writer.write("hello foo!");
    writer.close();

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }


}

class ReadTextFile {

  public static void main(String[] args) {
    try {
      File myFile = new File("myText.txt");
      FileReader fileReader = new FileReader(myFile);

      BufferedReader reader = new BufferedReader(fileReader);

      String line = null;

      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
