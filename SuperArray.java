public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray() {
    data = new String[10];
  }
  public SuperArray(int startingCapacity) {
    try {
      if (startingCapacity < 0) {
        throw new IllegalArgumentException("Invalid starting capacity, can't initiate constructor");
      }
    }
    catch(IllegalArgumentException e) {
      System.out.println("Caught a problem in the constructor");
      throw e;
    }
    data = new String[startingCapacity];
  }
  public void clear() {
    data = new String[0];
    size = 0;
  }
  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public boolean add( String element) {
    if (data.length <= size) {
      resize();
    }
    data[size] = element;
    size = size + 1;
    return true;
  }
  public String toString() {
    String kai = "[";
    if (size == 0) {
      kai = kai + "]";
    }
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
    if (size == 0) {
      kai = kai + "]";
    }
    for(int i = 0; i < data.length; i = i + 1) {
      if (data[i] != null) {
        if (i == data.length - 1) {
          kai = kai + data[i] + "]";
        } else {
          kai = kai + data[i] + ", ";
        }
      } else {
        if (i == data.length - 1) {
          kai = kai + "null" + "]";
        } else {
          kai = kai + "null" + ", ";
        }
      }
    }
    return kai;
  }
  public String get(int index) {
    try {
      if (index < 0 || index >= size()) {
        throw new IndexOutOfBoundsException("Invalid index, can't initiate get command");
      }
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("Caught a problem in get(int index)");
      throw e;
    }
    return data[index];
  }
  public String set(int index, String element) {
    try {
      if (index < 0 || index >= size()) {
        throw new IndexOutOfBoundsException("Invalid index, can't initiate set command");
      }
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("Caught a problem in set(int index, String element)");
      throw e;
    }
    String a = data[index];
    data[index] = element;
    return a;
  }
  private void resize() {
    String[] shake = new String[size * 2 + 1];
    for(int i = 0; i < data.length; i = i + 1) {
      shake[i] = data[i];
    }
    data = shake;
  }
  public boolean contains(String target) {
    for(int i = 0; i < size; i = i + 1) {
      if (data[i].equals(target)) {
        return true;
      }
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
    try {
      if (index < 0 || index > size()) {
        throw new IndexOutOfBoundsException("Invalid index, can't initiate add command");
      }
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("Caught a problem in add(int, string)");
      throw e;
    }
    if (data.length <= size) {
      resize();
    }
    if (data[data.length - 1] != null) {
      String[] kami = new String[data.length + 1];
      for(int i = 0; i < index; i = i + 1) {
        kami[i] = data[i];
      }
      kami[index] = element;
      for (int i = index; i < size; i = i + 1) {
        kami[i + 1] = data[i];
      }
          data = kami;
    } else {
      String[] kami = new String[data.length];
      for(int i = 0; i < index; i = i + 1) {
        kami[i] = data[i];
      }
      kami[index] = element;
      for (int i = index; i < size; i = i + 1) {
        kami[i + 1] = data[i];
      }
          data = kami;
    }

    size = size + 1;
  }
  public String remove(int index) {
    try {
      if (index < 0 || index > size()) {
        throw new IndexOutOfBoundsException("Invalid index, can't initiate remove command");
      }
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("Caught a problem in remove(int index)");
      throw e;
    }
    String a = data[index];
    size = size - 1;
    String[] locus = new String[data.length - 1];
    for(int i = 0; i < index; i = i + 1) {
      locus[i] = data[i];
    }
    for(int i = index; i < data.length - 1; i = i + 1) {
      locus[i] = data[i + 1];
    }
    data = locus;
    return a;
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
