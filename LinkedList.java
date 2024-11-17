class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    // 시작 포인터
    private Node head;
    // 마지막 포인터
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        // size == 0
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
        }
    }

    // 물리적인 인덱스를 가지는 것이 아닌 저장한 순서에 따른 논리적인 인덱스를 가짐
    // head -> 0 -> 1 -> 2 -> tail
    public void remove(int index) {

        // index == 0
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            // (삭제할 인덱스 - 1)으로 이동하여 (삭제할 인덱스 + 1)의 값과 붙여줌
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;

            // 만약 마지막 노드였다면
            if (index == size - 1) {
                tail = current;
            }
        }
    }
}
