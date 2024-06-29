package linked_list.palindrom.java;

public class Result {
    private LinkedListNode node;
    private Boolean isEqual;

    public Result(LinkedListNode node, Boolean isEqual) {
        this.node = node;
        this.isEqual = isEqual;
    }

    public LinkedListNode getNode() {
        return this.node;
    }

    public Boolean getIsEqual() {
        return this.isEqual;
    }

    public void setNode(LinkedListNode node) {
        this.node = node;
    }

    public void setIsEqual(Boolean isEqual) {
        this.isEqual = isEqual;
    }
}
