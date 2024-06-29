package linked_list.loop_detection.java;

import linked_list.loop_detection.java.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

public class LoopDetection {
    public static void main(String[] args){
        LoopDetection init = new LoopDetection();
        LinkedListNode header = init.buildLinkedListFromArray(new Integer[] {1,2,3,4,5,6,7,8,9});
        LinkedListNode portal = init.buildLinkedListFromArray(new Integer[] {10,11,12,13});
        portal = init.makeLoop(portal);
        header = init.addLoop(header, portal);
        LinkedListNode popLoop = init.loopDetector(header);
        System.out.println(init.checkLoop(popLoop));
    }
    
    public LinkedListNode loopDetector(LinkedListNode head) {
        LinkedListNode fastNode = moveFast(head);
        LinkedListNode slowNode = moveSlow(head);
        while (fastNode != null && slowNode != null && fastNode != slowNode) {
            fastNode = moveFast(fastNode);
            slowNode = moveSlow(slowNode);
        }
        slowNode = head;
        while (fastNode != null && slowNode != null && fastNode != slowNode) {
            slowNode = moveSlow(slowNode);
            fastNode =  moveSlow(fastNode);
        }
        return slowNode; 
    }
    
    public LinkedListNode moveFast(LinkedListNode node) {
        LinkedListNode pointer = node;
        if (pointer != null) {
            pointer = pointer.getNext();
            if (pointer != null) {
                pointer = pointer.getNext();
            }
        }
        return pointer;
    }
    
    public LinkedListNode moveSlow(LinkedListNode node) {
        LinkedListNode pointer = node;
        if (pointer != null) {
            pointer = pointer.getNext();
        }
        return pointer;
    }
    public LinkedListNode buildLinkedListFromArray(Integer[] list) {
        LinkedListNode head = null;
        for (int index = list.length - 1; index >= 0; index--) {
            head = new LinkedListNode(list[index], head);
        }
        return head;
    }
    public LinkedListNode addLoop(LinkedListNode head, LinkedListNode loopPortal) {
        LinkedListNode pointer = head;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
        pointer.setNext(loopPortal);
        return head;
    }
    public LinkedListNode makeLoop(LinkedListNode head) {
        LinkedListNode tail = head;
        while (tail.getNext() != null) {
            tail = tail.getNext();
        }
        tail.setNext(head);
        return tail.getNext();
    }
    public void printLinkedList(LinkedListNode head) {
        while (head != null) {
            System.out.println(head.getData());
            head = head.getNext();
        }
    }
    public boolean checkLoop(LinkedListNode portalNode) {
        Set<LinkedListNode> listNodeSet = new HashSet<>();
        while (!listNodeSet.contains(portalNode)) {
            listNodeSet.add(portalNode);
            System.out.println(portalNode.getData());
            portalNode = portalNode.getNext();
            if (portalNode == null) {
                return false;
            }
        }
        return true;
    }
}