package Util;

import java.time.temporal.TemporalAccessor;
import java.util.Collection;

public class CustomLinkedList<DesiredType> {
    private static final class Entry {

        private Entry next;

        private Entry previous;

        private Object data;

        public Entry(Object data) {
            this.data = data;
        }
    }

    private Entry head;

    private Entry tail;
    private int size = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    public void clear(){

    }

    public Object[] toArray(){
        Object[] newList = new Object[size];
        Entry last = null;
        for (int index = 0; index < size; index++){
            newList[index] = head.data;
            last = head;
            head = head.next;
        }
        return newList;
    }

    public boolean contains(Object toFind){
        return false;
    }

    public boolean containsAll(Collection<? extends DesiredType> items){
        return false;
    }

    public void add(DesiredType item) {
        Entry newEntry = new Entry(item);
        tail = head;
        newEntry.next = null;
        if (head == null) {
            newEntry.previous = null;
            head = newEntry;
            size++;
            return;
        }
        while (tail.next != null){
            tail = tail.next;}
        tail.next = newEntry;
        newEntry.previous = tail;
        tail = tail.next;
        size++;
    }
    public boolean addAll(Collection<? extends DesiredType> items){
        return false;
    }

    public boolean addAll(Collection<? extends DesiredType> items, int index) {
        return false;
    }

    public DesiredType remove(Object item){
        return null;
    }

    public DesiredType remove(int index){
        return null;
    }

    public boolean removeAll(Collection<? extends DesiredType> items){
        return false;
    }

    public DesiredType set(int index, DesiredType item){
        return null;
    }

    public DesiredType get(int index) {
        int i = 0;
        while (i < index){
            head = head.next;
            i++;
        }
        Object newData;
        newData = this.head.data;
        String newer = newData.toString();
        return (DesiredType) newer;
    }

    public int indexOf (Object item){
        for (int i = 0; i < size; i++){
            if (head.data.equals(item)){
                return i;
            }
            head = head.next;
        }
        return 999999;
    }

    public int lastIndexOf (Object item){
        for (int i = size - 1; i >= 0; i--){
            if (tail.data.equals(item)){
                return i;
            }
            tail = tail.previous;
        }
        return 999999;
    }

}

