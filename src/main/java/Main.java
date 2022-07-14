public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.offer("5");


        System.out.println("peek "+queue.peek());
        System.out.println(queue);

    }
}
