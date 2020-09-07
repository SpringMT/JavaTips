import java.util.Iterator;

public class SequentialSearch<T> {
  public boolean search(T[] collection, T t) {
    for (T item : collection) {
      if (item.equals(t)) {
        return true;
      }
    }
    return false;
  }


  public boolean search(Iterable<T> collection, T t) {
    Iterator<T> iter = collection.iterator();
    while(iter.hasNext()) {
      if(iter.next().equals(t)) {
        return true;
      }
    }
    return false;
  }
}
