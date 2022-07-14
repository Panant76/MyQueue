import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue {
    private final List<String> list;
    private Integer maxSize;

    public MyQueue() {
        this.list = new ArrayList<>();
    }

    public MyQueue(int maxSize) {
        this.list = new ArrayList<>();
        this.maxSize = maxSize;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "list=" + list +
                '}';
    }

    public boolean empty() {
        return this.list.isEmpty();
    }

    public boolean add(String str) {
        if (maxSize != null && list.size() == maxSize) {
            throw new IllegalStateException();
        }
        this.list.add(0, str);
        return true;
    }

    public String peek() {
        return this.list.isEmpty() ? null : this.list.get(list.size() - 1);
    }

    public String pool() {
        if (this.list.isEmpty()) {
            return null;
        }
        return this.list.remove(list.size() - 1);
    }

    public String remove() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.list.remove(list.size() - 1);
    }

    public boolean offer(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        try {
            return add(str);
        } catch (IllegalStateException e) {
            return false;
        }
    }
        public String element () {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size()-1);
        }
    }