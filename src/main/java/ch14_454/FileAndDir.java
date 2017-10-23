package ch14_454;

import java.io.*;

/**
 * Created by hanz on 17-10-23.
 */


public class FileAndDir {


  public static void main(String[] args) {
    File f = new File("MyCode.txt");
    File dir = new File("mycode");
    dir.mkdir();

    if (dir.isDirectory()) {
      String[] dirContents = dir.list();
      for (int i = 0; i < dirContents.length; i++) {
        System.out.println(dirContents[i]);
      }
    }

    System.out.println(dir.getAbsolutePath());

    boolean isDeleted = f.delete();
  }
}


