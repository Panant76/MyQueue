import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Queue;

public class MyQueueUnSizeTest {
    private MyQueue queue;

    @BeforeEach
    void setup() {
        this.queue = new MyQueue();
    }

    @Test
    void remove_OK() {
        queue.add("123");
        Assertions.assertEquals("123", queue.remove());
        Assertions.assertEquals(0, queue.size());
    }

    @Test
    void element_ThrowExeption() {
        Assertions.assertThrows(NoSuchElementException.class, () -> queue.element());
    }

    @Test
    void element_OK() {
        queue.add("123");
        Assertions.assertEquals("123", queue.element());
    }

    @Test
    void remove_ThrowExeption() {
        Assertions.assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    void add_OK() {
        queue.add("123");
        Assertions.assertEquals(1, queue.size());
        Assertions.assertEquals("123", queue.peek());
    }

    @Test
    void offer_OK() {
        boolean str = queue.offer("123");
        Assertions.assertEquals(1, queue.size());
        Assertions.assertEquals("123", queue.peek());
        Assertions.assertTrue(str);
    }

    @Test
    void poll_ReturnNull() {
        Assertions.assertEquals(0, queue.size());
        Assertions.assertNull(queue.poll());
    }

    @Test
    void poll_OK() {
        queue.add("123");
        Assertions.assertEquals("123", queue.poll());
        Assertions.assertEquals(0, queue.size());
    }

    @Test
    void peek_ReturnNull() {
        Assertions.assertEquals(0, queue.size());
        Assertions.assertNull(queue.peek());
    }

    @Test
    void peek_OK() {
        queue.add("123");
        Assertions.assertEquals("123", queue.peek());
        Assertions.assertEquals(1, queue.size());
    }


}
