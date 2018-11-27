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
        if (size == 0) tail = head.next;
    }

    public int size() {
        // TO DO: Complete the body of this method.
        int size = 0;
        Node current = head.next;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    public void concat(TestLinkedList<E> list2 ) { 
        // TO DO: Complete the body of this method.
        tail.next = list2.head.next;
        tail = list2.tail;
    }

    @Override
    public String toString () {
    if (size == 0) return "[ ]";
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
        listB.add("six ") ;
        listB.add("five");
        listB.add("four");
        System.out.println("List B: " + listB);
        listA.concat(listB);
        System.out.println("Concatenated lists : " + listA);
        }
}



    


    