public class Main {
    public static void main(String[] args) {

        System.out.println("=== MyArrayList ===");
        MyArrayList<Integer> arrayList = new MyArrayList<>();

        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.addFirst(1);
        arrayList.addLast(10);
        arrayList.add(2, 7);

        System.out.println("Size: " + arrayList.size());
        System.out.println("First: " + arrayList.getFirst());
        System.out.println("Last: " + arrayList.getLast());
        System.out.println("Index of 7: " + arrayList.indexOf(7));
        System.out.println("Exists 10: " + arrayList.exists(10));

        arrayList.remove(2);
        arrayList.removeFirst();
        arrayList.removeLast();

        arrayList.sort();

        for (Integer x : arrayList) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("\n=== MyLinkedList ===");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.addFirst(1);
        linkedList.addLast(10);
        linkedList.add(2, 7);

        System.out.println("Size: " + linkedList.size());
        System.out.println("First: " + linkedList.getFirst());
        System.out.println("Last: " + linkedList.getLast());
        System.out.println("Index of 7: " + linkedList.indexOf(7));
        System.out.println("Exists 10: " + linkedList.exists(10));

        linkedList.remove(2);
        linkedList.removeFirst();
        linkedList.removeLast();

        linkedList.sort();

        for (Integer x : linkedList) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("\n=== MyStack ===");

        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());
        System.out.println("\n=== MyQueue ===");

        MyQueue<Integer> queue = new MyQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
    }
}
