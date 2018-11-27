/**
 * @author Caleb Spradlin
 * @version November 26, 2018
 */

public class TestLinkedList<E> { 
    private Node head ;
    private Node tail ;

    private class Node { 
        private E data ;
        private Node next ;
        private Node(E data , Node next) { 
            this.data = data;
            this.next = next;
        }
        private Node(E data) { 
            this(data, null);
        }
        private Node() { 
            this(null, null);
        } 
    }

    public TestLinkedList() { 
        this.head = new Node(); tail = head;
    }

    public void add(E item) {
        head.next = new Node(item, head.next);
        if (head == tail) tail = head.next;
    }

    public int size() {
        // TO DO: Complete the body of this method.
        Node current = head.next;
        return size(current, 0);
    }

    private int size(Node current, int size){
        if (current == null){
            return size;
        }
        size++;
        return size(current.next, size);
    }

    public void concat(TestLinkedList<E> list2 ) { 
        // TO DO: Complete the body of this method.
        tail.next = list2.head.next;
        tail = list2.tail;
    }

    @Override
    public String toString () {
        if (head == tail) return "[ ]";
        StringBuilder sb = new StringBuilder ("["); 
        Node current = head . next ;
        while ( current . next != null ) {
            sb.append(current.data + ", ");
            current = current.next;
        }
        sb.append(current.data + "]\n"); 
        return sb.toString();
    }

    public static void main(String [] args) { 
        TestLinkedList<String> listA = new TestLinkedList<>(); 
        TestLinkedList<String> listB = new TestLinkedList<>();
        listA.add("three");
        listA .add("two");
        listA .add("one");
        System.out.println("List A: " + listA);
        System.out.println("List A Size: " + listA.size());
        listB.add("six ") ;
        listB.add("five");
        listB.add("four");
        System.out.println("List B: " + listB);
        System.out.println("List B Size: " + listB.size());
        listA.concat(listB);
        System.out.println("Concatenated lists : " + listA);
        System.out.println(listA.size());
        }
}



    


    