public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.addFirst(34);
        list.addLast(54);
        list.addAt(1, 89);

        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Element at index 2: " + list.get(2));

        list.removeAt(1);

        System.out.println("Size of the list: " + list.size()); 

        System.out.println("Element at index 0: " + list.get(0)); 
        System.out.println("Element at index 1: " + list.get(1)); 
        System.out.println("Element at index 1: " + list.get(2));
    }
}
