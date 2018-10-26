public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray() {
    data = new String[10];
  }
  public void clear() {
    data = new String[0];
  }
  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public boolean add(String element) {
    if (size == data.length) {
      resize();
    }
    data[size] = element;
    size = size + 1;
    return true;
  }
  public String toString() {
    String kai = "[";
    for(int i = 0; i < size; i = i + 1) {
      if (i == size - 1) {
        kai = kai + data[i] + "]";
      } else {
        kai = kai + data[i] + ", ";
      }
    }
    return kai;
  }
  public String toStringDebug() {
    String kai = "[";
    for(int i = 0; i < size; i = i + 1) {
      if (data[i] != null) {
        if (i == size - 1) {
          kai = kai + data[i] + "]";
        } else {
          kai = kai + data[i] + ", ";
        }
      } else {
        if (i == size - 1) {
          kai = kai + "null" + "]";
        } else {
          kai = kai + "null" + ", ";
        }
      }
    }
    return kai;
  }
  public String get(int index) {
    if (0 <= index && index < size) {
      return data[index];
    } else {
      return "null";
    }
  }
  public String set(int index, String element) {
    String a = data[index];
    if (0 <= index && index < size) {
      data[index] = element;
      return a;
    } else {
      return "null";
    }
  }
  private void resize() {
    String[] shake = new String[data.length + 1];
    for(int i = 0; i < data.length; i = i + 1) {
      shake[i] = data[i];
    }
    data = shake;
  }
  public boolean contains(String target) {
    for(int i = 0; i < size; i = i + 1) {
      return data[i].equals(target);
    }
    return false;
  }
  public int indexOf(String target) {
    int count = 0;
    for (int i = 0; i < size; i = i + 1) {
      if (data[i].equals(target)) {
        return count;
      } else {
        count = count + 1;
      }
    }
    return -1;
  }
  public int lastIndexOf(String target) {
    int count = size - 1;
    for (int i = size - 1; i > -1; i = i - 1) {
      if (data[i].equals(target)) {
        return count;
      } else {
        count = count - 1;
      }
    }
    return -1;
  }
  public void add(int index, String element) {
    if (index < 0 || index > size()) {
      System.out.println( "ERROR");
    } else {
      resize();
      String[] kami = new String[data.length + 1];
      for(int i = 0; i < index; i = i + 1) {
        kami[i] = data[i];
      }
      kami[index] = element;
      for (int i = index ; i < size + 1; i = i + 1) {
        kami[i + 1] = data[i];
      }
      data = kami;
    }
  }
  public String remove(int index) {
    if (index < 0 || index > size()) {
      return "null";
    } else {
      size = size - 1;
      String[] locus = new String[data.length - 1];
      for(int i = 0; i < index; i = i + 1) {
        locus[i] = data[i];
      }
      for(int i = index; i < size - 1; i = i + 1) {
        locus[i] = data[i + 1];
      }
      data = locus;
    }
    return "IT HAS BEEN DONE";
  }
  public boolean remove(String element) {
    if (contains(element)) {
      remove(indexOf(element));
      return true;
    } else {
      return false;
    }
  }
}
