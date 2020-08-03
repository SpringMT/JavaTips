import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipsTest {

  @Test
  void reverse() {
    int[] target = new int[] {1, 3, 2};
    Tips.reverse(target, 0);
    assertArrayEquals(target, new int[] {2, 3, 1});
  }

  @Test
  void swap() {
    int[] target = new int[] {1, 2, 3};
    Tips.swap(target, 1, 2);
    assertArrayEquals(target, new int[] {1, 3, 2});
  }
}