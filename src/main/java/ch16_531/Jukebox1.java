package ch16_531;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by hanz on 17-10-24.
 */
public class Jukebox1 {

  ArrayList<Song> songList = new ArrayList<Song>();
//  TreeSet<String> songList = new TreeSet<>();

  public static void main(String[] args) {
    new Jukebox1().go();
  }

  public void go() {
    getSong();
    System.out.println(songList);
    Collections.sort(songList);
    System.out.println(songList);
  }

  void getSong() {
    try {
      File file = new File("SongList.txt");
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line = null;
      while ((line = reader.readLine()) != null) {
        addSong(line);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  void addSong(String lineToParse) {
    String[] tokens = lineToParse.split("/");
    Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
    songList.add(nextSong);
  }
}

class Song implements Comparable<Song>{
  String title;
  String artist;
  String rating;
  String bpm;

  public int compareTo(Song s) {
    return title.compareTo(s.getTitle());
  }


  public boolean equals(Object aSong) {
    Song s = (Song) aSong;
    return getTitle().equals(s.getTitle());
  }

  public int hashCode() {
    return title.hashCode();
  }

  Song(String t, String a, String r, String b) {
    title = t;
    artist = a;
    rating = r;
    bpm = b;
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public String getRating() {
    return rating;
  }

  public String getBpm() {
    return bpm;
  }

//  @Override
//  public String toString() {
//    return super.toString();
//  }

  @Override
  public String toString() {
    return title;
  }
}
