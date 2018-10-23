public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10]
    size = 0;
  }

  public void clear() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    if (size() == 0) {
      return true;
    }
    return false;
  }

  public boolean add(String str) {
    if (data.length > size()) {
      data[size()] = str;
      size() += 1;
      return true;
    }
    return false;
  }

  public String toString() {
    if (size() > 0) {
      String f = "[" + data[0];
      for (int i = 1; i < size(); i++) {
        f += "," + data[i];
      }
      f += "]";
      return f;
    }
    return "[]";

  public String toStringDebug() {
    if (data[0] == null) {
      String f = "[null";
    }
    else {
      String f = "[" + data[0];
    }
    for (int i = 0; i < data.length; i++) {
      f += ","
      if (data[i] == null) {
        f += "null"
      }
      else {
        f += data[i];
      }
    }
    f += "]"
    return f;
  }

  public String get(int index) {

  }
}
