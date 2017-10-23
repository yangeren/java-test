package ch14_454;

import junit.framework.TestCase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by hanz on 17-10-23.
 */
public class SerializableFileTest extends TestCase {

  public static void main(String[] args) {
    SerializableFile d = new SerializableFile();
    System.out.println(d.getX() + d.getY() + d.getZ());
    try {
      FileOutputStream fos = new FileOutputStream("dg.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(d);
      oos.close();

      FileInputStream fis = new FileInputStream("dg.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      d = (SerializableFile) ois.readObject();
      ois.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    System.out.println(d.getX() + d.getY() + d.getZ());
  }

}