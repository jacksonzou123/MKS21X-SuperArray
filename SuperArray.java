public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int startCap) {
    data = new String[startCap];
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
    if (data.length == size()) {
      resize();
    }
    data[size()] = str;
    size += 1;
    return true;
  }

  public String toString() {
    if (size() > 0) {
      String f = "[" + data[0];
      for (int i = 1; i < data.length; i++) {
        if (data[i] != null) {
          f += "," + data[i];
        }
      }
      f += "]";
      return f;
    }
    return "[]";
  }

  public String toStringDebug() {
    String f;
    f = "[" + data[0];
    for (int i = 1; i < data.length; i++) {
      f += "," + data[i];
    }
    f += "]";
    return f;
  }

  public String get(int index) {
    if (index >= 0 && index < size()) {
      return data[index];
    }
    System.out.println("Error: Index out of bounds (get() method)");
    return null;
  }

  public String set(int index, String str) {
    if (index >= 0 && index < size()) {
      data[index] = str;
      return str;
    }
    System.out.println("Error: Index out of bounds (set() method)");
    return null;
  }

  private void resize() {
    String[] newA = data;
    data = new String[newA.length * 2 + 1];
    for (int i = 0; i < newA.length; i++) {
      data[i] = newA[i];
    }
  }

  public boolean contains(String target) {
    for (int i = 0; i < size(); i++) {
      if (data[i].equals(target)) {
        return true;
      }
    }
    return false;
  }

  public int indexOf(String target) {
    for (int i = 0; i < size(); i++) {
      if (data[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(String target) {
    for (int i = size() - 1; i > -1; i -= 1) {
      if (data[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  public void add(int index, String target) {
    if (index > 0 && index <= size()) {
      if (size() == data.length) {
        resize();
      }
      for (int i = size(); i > index; i -= 1) {
        data[i] = data[i-1];
      }
      data[index] = target;
      size += 1;
    }
    else {
      System.out.println("Error: index out of bounds (add(index, target))");
    }
  }

  public String remove(int index) {
    if (index > 0 && index < size()) {
      String f = data[index];
      for (int i = index; i < size() - 1; i++) {
        data[i] = data[i+1];
      }
      size -= 1;
      return f;

    }
    System.out.println("Error: index out of bounds (remove())");
    return null;
  }

  public boolean remove(String target) {
    if (contains(target)) {
      int index = indexOf(target);
      remove(index);
      return true;
    }
    return false;
  }
}
