public class SuperArray{
  private String data;
  private int size;
  public SuperArray(String go, int length) {
    data = go;
    size = length;
  }
  public void clear() {
    data = "";
  }
  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return size == 0;
  }
}
