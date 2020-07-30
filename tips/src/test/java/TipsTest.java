import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipsTest {

  @Test
  void swap() {
    int[] target = new int[] {1, 2, 3};
    Tips.swap(target, 1, 2);
    assertArrayEquals(target, new int[] {1, 3, 2});
  }
}