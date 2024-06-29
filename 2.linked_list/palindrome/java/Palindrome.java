package linked_list.palindrom.java;

class Palindrome {
    public static void main(String[] args) {
        Palindrome init = new Palindrome();
        LinkedListNode header = init.buildLinkedListFromArray(new Integer[]{1,6,6,6,1,6,1});
        System.out.println(init.isPalindrome(header));
    }
    public boolean isPalindrome(LinkedListNode head) {
        int length = getLinkedListLength(head);
        return compareNode(head, length).getIsEqual();
    }
    public Result compareNode(LinkedListNode node, int length) {
        if (length <= 0) {
            return new Result(node, true);
        } else if (length == 1 && node.getNext() != null) {
            return new Result(node.getNext(), true);
        }
        if (node.getNext() == null) {
            return new Result(node, true);
        }
        Result result = compareNode(node.getNext(), length - 2);
        System.out.println("Current node : " + node.getData());
        System.out.println("Pair node : " + result.getNode().getData());

        if (result.getNode().getData() == node.getData() && result.getIsEqual()) {
            result.setNode(result.getNode().getNext());
        } else {
            result.setNode(result.getNode().getNext());
            result.setIsEqual(false);
        }
        if (result.getNode() == null) {
            result.setNode(node);
        }
        return result;

    }
    public int getLinkedListLength(LinkedListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.getNext();
        }
        return size;
    }
    public LinkedListNode buildLinkedListFromArray(Integer[] list) {
        LinkedListNode head = null;
        for (int index = list.length - 1; index >= 0; index--) {
            head = new LinkedListNode(list[index], head);
        }
        return head;
    }
}