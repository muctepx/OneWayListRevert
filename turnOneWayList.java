public class turnOneWayList {
    Node head;
 
public void revert(){
    if (head != null && head.next != null){
        Node tmp = head;
        revert(head.next, head);
        tmp.next = null;
    }
}
private void revert (Node currNode, Node previousNode){
    if (currNode.next == null){
        head = currNode;
    }
    else{
        revert(currNode.next, currNode);
    }
    currNode.next = previousNode;
    
}

    public class Node {
        int value;
        Node next;
    }
}