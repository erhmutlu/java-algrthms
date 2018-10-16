package org.erhmutlu.algrthms.datastructures;

public class SinglyLinkedList<T> {

    private ListItem<T> first;
    private ListItem<T> last;
    private int size = 0;

    public T head() {
        return first.getData();
    }

    public T tail() {
        return last.getData();
    }

    public void add(T t) {
        ListItem<T> item = new ListItem<>();
        item.setData(t);

        if (size == 0) {
            first = item;
            last = item;
        } else {
            last.setNext(item);
            last = item;
        }
        size++;
    }

    public void remove(int index) {
        if (index == 0) {
            ListItem<T> second = first.getNext();
            first = second;
        } else if (index < size) {
            ListItem<T> current = first;
            for (int i = 1; i <= index - 1; i++) {
                current = current.getNext();
                if (i == index - 1){
                    ListItem<T> removingItem = current.getNext();
                    current.setNext(removingItem.getNext());
                    removingItem.setNext(null);
                    removingItem.setData(null);
                    removingItem = null;
                }
            }
        }else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        ListItem<T> current = first;
        while (current != null) {
            sb.append(current.getData()).append(",");
            current = current.getNext();
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }
}
