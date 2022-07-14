import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue {
    private final List<String> list;

    public MyQueue() {
        this.list = new LinkedList<>();
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
        try {
            if (list.isEmpty()) {
                offer(str);
            } else{
                this.list.add(list.size() - 1, str);
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public String peek() {
        return list.isEmpty() ? null : list.get(0);
    }


    public String pool() {
        if (list.isEmpty()) {
            return null;
        }
        String str = list.get(0);
        list.remove(str);
        return str;
    }

    public String remove() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        String str = list.get(0);
        list.remove(str);
        return str;
    }

    public boolean offer(String str) {
        try {
            list.add(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public String element() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.get(0);
    }
}