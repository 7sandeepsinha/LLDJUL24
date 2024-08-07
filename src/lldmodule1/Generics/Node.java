package lldmodule1.Generics;

import java.util.Iterator;

public class Node implements Iterable<Integer>{

    private int data;
    private Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new NodeIterator();

    }

    private class NodeIterator implements Iterator<Integer> {
        private Node current = Node.this;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                Integer value = current.data;
                current = current.next;
                return value;
            } else {
                throw new NullPointerException("No new next node");
            }
        }
    }
}
