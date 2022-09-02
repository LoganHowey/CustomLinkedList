package Util;

import java.util.Collection;

public class CustomLinkedList<DesiredType> {

    private Entry head;

    private Entry tail;

    private int size;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return false;
    }

    public void clear(){

    }

    public Object[] toArray(){
        return null;
    }

    public boolean contains(Object toFind){
        return false;
    }

    public boolean containsAll(Collection<? extends DesiredType> items){
        return false;
    }

    public void add(DesiredType item){
        if (tail == null){
            tail = new Entry(item);
        }
        else{
            Entry newEntry = new Entry(item);
            tail.next = newEntry;
            tail = newEntry;
        }
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

    public DesiredType get(int index){
        Entry[index] 
        return null;
    }

    public int indexOf (Object item){
        return 0;
    }

    public int lastIndexOf (Object item){
        return 0;
    }

}

