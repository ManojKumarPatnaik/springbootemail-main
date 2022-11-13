import java.util.LinkedList;
import java.util.List;

public class LinkedListC<T extends Comparable<T>>  {

    private int data;
    LinkedListC linkedListC;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedListC getLinkedListC() {
        return linkedListC;
    }

    public void setLinkedListC(LinkedListC linkedListC) {
        this.linkedListC = linkedListC;
    }
}
