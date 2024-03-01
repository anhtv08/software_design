package DTA;

public class DoubleLinkedList {
    DoubleLinkedListNode head, tail;
    int size = 0;
    public void addFirst(DoubleLinkedListNode doubleLinkedListNode){
        
        if(size ==0){
            head = tail = doubleLinkedListNode;
        }else {
            head.pre = doubleLinkedListNode;
            doubleLinkedListNode.next = head;
            head = doubleLinkedListNode;
        }
        size++;
    }
    public void addLast(DoubleLinkedListNode doubleLinkedListNode){
        
        if(size == 0){
            head = tail =doubleLinkedListNode;
        } else {
            tail.next = doubleLinkedListNode;
            doubleLinkedListNode.pre = tail;
            tail = doubleLinkedListNode;
        }
        size++;
    }

    public DoubleLinkedListNode removeLast(){
        if(size==0) return null;
        if (size ==1){
            head = tail = null;
        }        
        DoubleLinkedListNode temp = tail;
        tail = tail.pre;
        tail.next.pre = null;
        tail.next = null; 
        size--;
        return temp;

    }

    int size(){
        return size;
    }
    static class DoubleLinkedListNode{
        int data;
        DoubleLinkedListNode pre;
        DoubleLinkedListNode next;
        public DoubleLinkedListNode(int data){
             this.data  = data;
        }
    }
    public static void main(String[] args) {
        DoubleLinkedListNode node1 = new DoubleLinkedListNode(1);
        DoubleLinkedListNode node2 = new DoubleLinkedListNode(2);
        DoubleLinkedListNode node3 = new DoubleLinkedListNode(3);
        DoubleLinkedList dLinkedList = new DoubleLinkedList();

        dLinkedList.addFirst(node1);
        dLinkedList.addFirst(node2);
        dLinkedList.addFirst(node3);
        System.out.println("size:" + dLinkedList.size);
        DoubleLinkedListNode doubleLinkedListNode = dLinkedList.removeLast();
        System.out.println(doubleLinkedListNode.data);
        System.out.println("size:" + dLinkedList.size);
    }
}
