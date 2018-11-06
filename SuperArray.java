public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int startCap) {
    if (startCap < 0) {
      throw new IllegalArgumentException("SuperArray cannot be initialized with this length: " + startCap);
    }
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
      for (int i = 1; i < size(); i++) {
          f += ", " + data[i];
      }
      f += "]";
      return f;
    }
    return "[]";
  }

  public String toStringDebug() {
    String f;
    if (data.length == 0) {
      return "[]";
    }
    f = "[" + data[0];
    for (int i = 1; i < data.length; i++) {
      f += ", " + data[i];
    }
    f += "]";
    return f;
  }

  public String get(int index) {
    if (index >= 0 && index < size()) {
      return data[index];
    }
    else{
      throw new IndexOutOfBoundsException("Index out of bounds for get(index): " + index);
    }
  }

  public String set(int index, String str) {
    if (index >= 0 && index < size()) {
      String f = data[index];
      data[index] = str;
      return f;
    }
    else {
      throw new IndexOutOfBoundsException("Index out of bounds for set(index):" + index);
    }
  }

  private void resize() {
    String[] f = new String[(data.length * 2) + 1];
    for (int i = 0; i < size(); i++) {
      f[i] = data[i];
    }
    data = f;
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
    if (index >= 0 && index <= size()) {
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
      throw new IndexOutOfBoundsException("Index out of bounds of add(index, target): " + index);
    }
  }

  public String remove(int index) {
    if (index >= 0 && index < size()) {
      String f = data[index];
      for (int i = index; i < size() - 1; i++) {
        data[i] = data[i+1];
      }
      data[size()-1] = null;
      size -= 1;
      return f;
    }
    else {
      throw new IndexOutOfBoundsException("Index out of bounds of remove(index): " + index);
    }
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
