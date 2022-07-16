import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyQueueSizeTest {
    private MyQueue queue;

    @BeforeEach
    void setup() {
        this.queue = new MyQueue(0);
    }

    @Test
    void add_ThrowExeption() {
        Assertions.assertThrows(IllegalStateException.class, () -> queue.add("String"));
    }

    @Test
    void offer_ThrowExeption() {
        Assertions.assertThrows(NullPointerException.class, () -> queue.offer(null));
    }

    @Test
    void offer_isFalse() {
        boolean res = queue.offer("new string");
        Assertions.assertEquals(0, queue.size());
        Assertions.assertFalse(res);
    }

}
