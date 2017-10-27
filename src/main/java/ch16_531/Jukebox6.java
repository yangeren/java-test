package ch16_531;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 * Created by hanz on 17-10-24.
 */
public class Jukebox6 {

  ArrayList<Song> songList = new ArrayList<Song>();
//  TreeSet<String> songList = new TreeSet<>();

  public static void main(String[] args) {
    new Jukebox6().go();
  }


  class ArtistCompare implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
      return o1.getArtist().compareTo(o2.getArtist());
    }
  }

  public void go() {
    getSong();
    System.out.println(songList);
    Collections.sort(songList);
    System.out.println(songList);


    HashSet<Song> songSet = new HashSet<Song>();
    songSet.addAll(songList);
    System.out.println(songSet);

    TreeSet<Song> songSet1 = new TreeSet<Song>();
    songSet1.addAll(songList);
    System.out.println(songSet1);

    ArtistCompare artistCompare = new ArtistCompare();
    Collections.sort(songList, artistCompare);
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


