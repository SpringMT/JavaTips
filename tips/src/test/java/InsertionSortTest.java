import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

  @Test
  void sort1() {
    int[] target = new int[] {1, 3, 2, 4, 5};
    InsertionSort.sort(target);
    assertArrayEquals(target, new int[] {1, 2, 3, 4 , 5});
  }

  @Test
  void sort2() {
    int[] target = new int[] {5, 4, 3 , 2, 1};
    InsertionSort.sort(target);
    assertArrayEquals(target, new int[] {1, 2, 3, 4 , 5});
  }

  @Test
  void sort3() {
    int[] target = new int[] {10, 9, 8, 7, 6, 5, 4, 3 , 2, 1};
    InsertionSort.sort(target);
    assertArrayEquals(target, new int[] {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10});
  }
}