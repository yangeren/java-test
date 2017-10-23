package ch14_454;

import java.io.Serializable;

/**
 * Created by hanz on 17-10-23.
 */


class SerializableFile implements Serializable {

  public int x = 3;
  transient long y = 4;
  private short z = 5;

  public int getX() {
    return x;
  }

  public long getY() {
    return y;
  }

  public short getZ() {
    return z;
  }
}
