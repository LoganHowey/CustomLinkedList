package Util;

import java.util.Collection;

public class CustomLinkedList<DesiredType> {

    private Entry head = null;

    private Entry tail = null;

    private int size = 0;

    private DesiredType[] data = (DesiredType[]) new Object()[];



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
        for (int i = 0; i <= this.size; i++){

        }
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
        Entry newEntry = new Entry(item);

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
        return null;
    }

    public int indexOf (Object item){
        return 0;
    }

    public int lastIndexOf (Object item){
        return 0;
    }

}

