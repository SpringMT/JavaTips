import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SequentialSearchTest {
  @Test
  void searchArray1() {
    var target = new Integer[] {1, 3, 2, 4, 5};
    assertTrue((new SequentialSearch<Integer>()).search(target, 1));
  }

  @Test
  void searchIterator1() {
    var target = new ArrayList<>(Arrays.asList(1, 3, 4, 5));
    assertTrue((new SequentialSearch<Integer>()).search(target, 1));
  }
}