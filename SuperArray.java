public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(String[] go, int length) {
    data = go;
    size = length;
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
    data[size] = element;
    return true;
  }
  public String toString() {
    String kai = "";
    for(int i = 0; i < size; i = i + 1) {
      if (i == size - 1) {
        kai = kai + data[i];
      } else {
        kai = kai + data[i] + ", ";
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
}
