package DTA;

public class BinaryTree {
    Node root;
    
    int size =0 ;
    public BinaryTree(Node root) {
        size = 1;
        this.root = root;
    }
    void insertNode(int data){
        Node cur = root;
        Node pre = root;

        while (cur !=null) {
            pre = cur;
            if(data < cur.data ){
                // shift left
                cur = cur.left;
            }else {
                cur = cur.right;
            }
            
        }
        Node newNode = new Node(data);
        if(data< pre.data){
            pre.left = newNode;
        }else {
            pre.right = newNode;
        }
        size++;
        
    }
    void deleteNode(int data){
        // todo:
    }
    boolean search(int data){
        Node foundNode =search(root, data);
        return foundNode!=null? true: false;
    }
    private Node search(Node current ,int data){
        if(current==null) return null;
        else{            
            if(current.data == data){
                return current;
            }else {
                if(current.left!=null){
                    return search(current.left, data);
                }
                if(current.right!=null){
                    return search(current.right, data);
                }
            }
        }
        // if(root.data == data)
        return null;
    }
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
        }
        
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        
        // Node node1 = new Node(1);
        // Node node2 = new Node(3);

        BinaryTree nBinaryTree = new BinaryTree(root);
        nBinaryTree.insertNode(1);
        nBinaryTree.insertNode(3);
        System.out.println("size:" + nBinaryTree.size);
        
        boolean searchRs = nBinaryTree.search(1);
        System.out.println("search 1," + searchRs);

        searchRs = nBinaryTree.search(0);
        System.out.println("found: 0," + searchRs);


    }
    
}
